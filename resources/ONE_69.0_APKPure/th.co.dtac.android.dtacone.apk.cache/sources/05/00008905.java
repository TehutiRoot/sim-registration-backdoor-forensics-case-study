package com.github.chrisbanes.photoview;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public class PhotoView extends ImageView {

    /* renamed from: a */
    public PhotoViewAttacher f43708a;

    public PhotoView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void m49296a() {
        this.f43708a = new PhotoViewAttacher(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
    }

    public PhotoViewAttacher getAttacher() {
        return this.f43708a;
    }

    public void getDisplayMatrix(Matrix matrix) {
        this.f43708a.getDisplayMatrix(matrix);
    }

    public RectF getDisplayRect() {
        return this.f43708a.getDisplayRect();
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f43708a.getImageMatrix();
    }

    public float getMaximumScale() {
        return this.f43708a.getMaximumScale();
    }

    public float getMediumScale() {
        return this.f43708a.getMediumScale();
    }

    public float getMinimumScale() {
        return this.f43708a.getMinimumScale();
    }

    public float getScale() {
        return this.f43708a.getScale();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f43708a.getScaleType();
    }

    public boolean isZoomEnabled() {
        return this.f43708a.isZoomEnabled();
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f43708a.setAllowParentInterceptOnEdge(z);
    }

    public boolean setDisplayMatrix(Matrix matrix) {
        return this.f43708a.setDisplayMatrix(matrix);
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.f43708a.update();
        }
        return frame;
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        PhotoViewAttacher photoViewAttacher = this.f43708a;
        if (photoViewAttacher != null) {
            photoViewAttacher.update();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        PhotoViewAttacher photoViewAttacher = this.f43708a;
        if (photoViewAttacher != null) {
            photoViewAttacher.update();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        PhotoViewAttacher photoViewAttacher = this.f43708a;
        if (photoViewAttacher != null) {
            photoViewAttacher.update();
        }
    }

    public void setMaximumScale(float f) {
        this.f43708a.setMaximumScale(f);
    }

    public void setMediumScale(float f) {
        this.f43708a.setMediumScale(f);
    }

    public void setMinimumScale(float f) {
        this.f43708a.setMinimumScale(f);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f43708a.setOnClickListener(onClickListener);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f43708a.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f43708a.setOnLongClickListener(onLongClickListener);
    }

    public void setOnMatrixChangeListener(OnMatrixChangedListener onMatrixChangedListener) {
        this.f43708a.setOnMatrixChangeListener(onMatrixChangedListener);
    }

    public void setOnOutsidePhotoTapListener(OnOutsidePhotoTapListener onOutsidePhotoTapListener) {
        this.f43708a.setOnOutsidePhotoTapListener(onOutsidePhotoTapListener);
    }

    public void setOnPhotoTapListener(OnPhotoTapListener onPhotoTapListener) {
        this.f43708a.setOnPhotoTapListener(onPhotoTapListener);
    }

    public void setOnScaleChangeListener(OnScaleChangedListener onScaleChangedListener) {
        this.f43708a.setOnScaleChangeListener(onScaleChangedListener);
    }

    public void setOnSingleFlingListener(OnSingleFlingListener onSingleFlingListener) {
        this.f43708a.setOnSingleFlingListener(onSingleFlingListener);
    }

    public void setRotationBy(float f) {
        this.f43708a.setRotationBy(f);
    }

    public void setRotationTo(float f) {
        this.f43708a.setRotationTo(f);
    }

    public void setScale(float f) {
        this.f43708a.setScale(f);
    }

    public void setScaleLevels(float f, float f2, float f3) {
        this.f43708a.setScaleLevels(f, f2, f3);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        PhotoViewAttacher photoViewAttacher = this.f43708a;
        if (photoViewAttacher != null) {
            photoViewAttacher.setScaleType(scaleType);
        }
    }

    public void setZoomTransitionDuration(int i) {
        this.f43708a.setZoomTransitionDuration(i);
    }

    public void setZoomable(boolean z) {
        this.f43708a.setZoomable(z);
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setScale(float f, boolean z) {
        this.f43708a.setScale(f, z);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m49296a();
    }

    public void setScale(float f, float f2, float f3, boolean z) {
        this.f43708a.setScale(f, f2, f3, z);
    }

    @TargetApi(21)
    public PhotoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m49296a();
    }
}