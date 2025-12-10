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
    public PhotoViewAttacher f43696a;

    public PhotoView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void m49299a() {
        this.f43696a = new PhotoViewAttacher(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
    }

    public PhotoViewAttacher getAttacher() {
        return this.f43696a;
    }

    public void getDisplayMatrix(Matrix matrix) {
        this.f43696a.getDisplayMatrix(matrix);
    }

    public RectF getDisplayRect() {
        return this.f43696a.getDisplayRect();
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f43696a.getImageMatrix();
    }

    public float getMaximumScale() {
        return this.f43696a.getMaximumScale();
    }

    public float getMediumScale() {
        return this.f43696a.getMediumScale();
    }

    public float getMinimumScale() {
        return this.f43696a.getMinimumScale();
    }

    public float getScale() {
        return this.f43696a.getScale();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f43696a.getScaleType();
    }

    public boolean isZoomEnabled() {
        return this.f43696a.isZoomEnabled();
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f43696a.setAllowParentInterceptOnEdge(z);
    }

    public boolean setDisplayMatrix(Matrix matrix) {
        return this.f43696a.setDisplayMatrix(matrix);
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.f43696a.update();
        }
        return frame;
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        PhotoViewAttacher photoViewAttacher = this.f43696a;
        if (photoViewAttacher != null) {
            photoViewAttacher.update();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        PhotoViewAttacher photoViewAttacher = this.f43696a;
        if (photoViewAttacher != null) {
            photoViewAttacher.update();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        PhotoViewAttacher photoViewAttacher = this.f43696a;
        if (photoViewAttacher != null) {
            photoViewAttacher.update();
        }
    }

    public void setMaximumScale(float f) {
        this.f43696a.setMaximumScale(f);
    }

    public void setMediumScale(float f) {
        this.f43696a.setMediumScale(f);
    }

    public void setMinimumScale(float f) {
        this.f43696a.setMinimumScale(f);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f43696a.setOnClickListener(onClickListener);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f43696a.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f43696a.setOnLongClickListener(onLongClickListener);
    }

    public void setOnMatrixChangeListener(OnMatrixChangedListener onMatrixChangedListener) {
        this.f43696a.setOnMatrixChangeListener(onMatrixChangedListener);
    }

    public void setOnOutsidePhotoTapListener(OnOutsidePhotoTapListener onOutsidePhotoTapListener) {
        this.f43696a.setOnOutsidePhotoTapListener(onOutsidePhotoTapListener);
    }

    public void setOnPhotoTapListener(OnPhotoTapListener onPhotoTapListener) {
        this.f43696a.setOnPhotoTapListener(onPhotoTapListener);
    }

    public void setOnScaleChangeListener(OnScaleChangedListener onScaleChangedListener) {
        this.f43696a.setOnScaleChangeListener(onScaleChangedListener);
    }

    public void setOnSingleFlingListener(OnSingleFlingListener onSingleFlingListener) {
        this.f43696a.setOnSingleFlingListener(onSingleFlingListener);
    }

    public void setRotationBy(float f) {
        this.f43696a.setRotationBy(f);
    }

    public void setRotationTo(float f) {
        this.f43696a.setRotationTo(f);
    }

    public void setScale(float f) {
        this.f43696a.setScale(f);
    }

    public void setScaleLevels(float f, float f2, float f3) {
        this.f43696a.setScaleLevels(f, f2, f3);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        PhotoViewAttacher photoViewAttacher = this.f43696a;
        if (photoViewAttacher != null) {
            photoViewAttacher.setScaleType(scaleType);
        }
    }

    public void setZoomTransitionDuration(int i) {
        this.f43696a.setZoomTransitionDuration(i);
    }

    public void setZoomable(boolean z) {
        this.f43696a.setZoomable(z);
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setScale(float f, boolean z) {
        this.f43696a.setScale(f, z);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m49299a();
    }

    public void setScale(float f, float f2, float f3, boolean z) {
        this.f43696a.setScale(f, f2, f3, z);
    }

    @TargetApi(21)
    public PhotoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m49299a();
    }
}
