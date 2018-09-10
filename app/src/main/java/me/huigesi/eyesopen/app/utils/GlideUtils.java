package me.huigesi.eyesopen.app.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;

import java.security.MessageDigest;

import me.huigesi.eyesopen.R;

public class GlideUtils {
    public static RequestOptions options = new RequestOptions()
            .centerCrop()
            .placeholder(R.drawable.picture)
            .skipMemoryCache(false)
            .error(R.drawable.picture_error)
            .diskCacheStrategy(DiskCacheStrategy.NONE);

    public static void load(Context context, String url, ImageView view, int weight, int height) {
        RequestOptions weightoptions = new RequestOptions()
                .centerCrop()
                .placeholder(R.drawable.picture)
                .skipMemoryCache(false)
                .error(R.drawable.picture_error)
                .override(weight, height)
                .diskCacheStrategy(DiskCacheStrategy.NONE);
        Glide.with(context).asBitmap()
                .load(url)
                .apply(weightoptions)
                .into(view);
    }

    public static void load(Context context, String url, ImageView view) {
        Glide.with(context)
                .asBitmap()
                .load(url)
                .apply(options)
                .into(view);
    }

    public static void loadAuto(final Context context, String url, final ImageView view) {

        Glide.with(context)
                .asBitmap()
                .load(url)
                .apply(options)
                .into(new SimpleTarget<Bitmap>() {
                    @Override
                    public void onResourceReady(@NonNull Bitmap resource, @Nullable Transition<? super Bitmap> transition) {

                        int imageWidth = resource.getWidth();
                        int imageHeight = resource.getHeight();
                        int width = Resolution.getScreenPixWidth(context);//固定宽度
                        //宽度固定,然后根据原始宽高比得到此固定宽度需要的高度
                        int height = width * imageHeight / imageWidth;
                        ViewGroup.LayoutParams para = view.getLayoutParams();
                        para.height = height;
                        para.width = width;
                        view.setImageBitmap(resource);
                    }
                });
    }

    public static void loadGif(final Context context, String url, ImageView view) {
        RequestOptions weightoptions = new RequestOptions()
                .placeholder(R.drawable.picture)
                .fitCenter()
                .error(R.drawable.picture_error)
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC);
        Glide.with(context)
                .load(url)
                .apply(weightoptions)
                .into(view);
    }

    public static void loadCircle(final Context context, String url, ImageView view, int weight, int height) {
        RequestOptions weightoptions = new RequestOptions()
                .centerCrop()
                .placeholder(R.drawable.picture)
                .skipMemoryCache(false)
                .error(R.drawable.picture_error)
                .override(weight, height)
                .diskCacheStrategy(DiskCacheStrategy.NONE);
        Glide.with(context)
                .asBitmap()
                .load(url)
                .apply(weightoptions)
                .into(new BitmapImageViewTarget(view) {
                    @Override
                    protected void setResource(Bitmap resource) {
                        RoundedBitmapDrawable circularBitmapDrawable =
                                RoundedBitmapDrawableFactory.create(context.getResources(), resource);
                        circularBitmapDrawable.setCircular(true);
                        view.setImageDrawable(circularBitmapDrawable);
                    }
                });
    }

    //实现圆角图片
    public static class GlideRoundTransform extends BitmapTransformation {

        private static float radius = 0f;

        public GlideRoundTransform(Context context) {
            this(context, 4);
        }

        public GlideRoundTransform(Context context, int dp) {
            this.radius = Resources.getSystem().getDisplayMetrics().density * dp;
        }

        @Override
        protected Bitmap transform(BitmapPool pool, Bitmap toTransform, int outWidth, int outHeight) {
            return roundCrop(pool, toTransform);
        }

        private static Bitmap roundCrop(BitmapPool pool, Bitmap source) {
            if (source == null) return null;

            Bitmap result = pool.get(source.getWidth(), source.getHeight(), Bitmap.Config.ARGB_8888);
            if (result == null) {
                result = Bitmap.createBitmap(source.getWidth(), source.getHeight(), Bitmap.Config.ARGB_8888);
            }

            Canvas canvas = new Canvas(result);
            Paint paint = new Paint();
            paint.setShader(new BitmapShader(source, BitmapShader.TileMode.CLAMP, BitmapShader.TileMode.CLAMP));
            paint.setAntiAlias(true);
            RectF rectF = new RectF(0f, 0f, source.getWidth(), source.getHeight());
            canvas.drawRoundRect(rectF, radius, radius, paint);
            return result;
        }

        public String getId() {
            return getClass().getName() + Math.round(radius);
        }

        @Override
        public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {

        }
    }

}
