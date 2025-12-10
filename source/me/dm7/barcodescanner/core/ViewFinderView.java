package me.dm7.barcodescanner.core;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;

/* loaded from: classes6.dex */
public class ViewFinderView extends View implements IViewFinder {

    /* renamed from: h */
    public static final int[] f71961h = {0, 64, 128, CertificateHolderAuthorization.CVCA, 255, CertificateHolderAuthorization.CVCA, 128, 64};

    /* renamed from: a */
    public Rect f71962a;

    /* renamed from: b */
    public int f71963b;

    /* renamed from: c */
    public final int f71964c;

    /* renamed from: d */
    public final int f71965d;

    /* renamed from: e */
    public final int f71966e;

    /* renamed from: f */
    public final int f71967f;

    /* renamed from: g */
    public final int f71968g;
    protected int mBorderLineLength;
    protected Paint mBorderPaint;
    protected Paint mFinderMaskPaint;
    protected Paint mLaserPaint;
    protected boolean mSquareViewFinder;

    public ViewFinderView(Context context) {
        super(context);
        this.f71964c = getResources().getColor(R.color.viewfinder_laser);
        this.f71965d = getResources().getColor(R.color.viewfinder_mask);
        this.f71966e = getResources().getColor(R.color.viewfinder_border);
        this.f71967f = getResources().getInteger(R.integer.viewfinder_border_width);
        this.f71968g = getResources().getInteger(R.integer.viewfinder_border_length);
        m26235a();
    }

    /* renamed from: a */
    public final void m26235a() {
        Paint paint = new Paint();
        this.mLaserPaint = paint;
        paint.setColor(this.f71964c);
        this.mLaserPaint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.mFinderMaskPaint = paint2;
        paint2.setColor(this.f71965d);
        Paint paint3 = new Paint();
        this.mBorderPaint = paint3;
        paint3.setColor(this.f71966e);
        this.mBorderPaint.setStyle(Paint.Style.STROKE);
        this.mBorderPaint.setStrokeWidth(this.f71967f);
        this.mBorderLineLength = this.f71968g;
    }

    public void drawLaser(Canvas canvas) {
        Rect framingRect = getFramingRect();
        Paint paint = this.mLaserPaint;
        int[] iArr = f71961h;
        paint.setAlpha(iArr[this.f71963b]);
        this.f71963b = (this.f71963b + 1) % iArr.length;
        int height = (framingRect.height() / 2) + framingRect.top;
        canvas.drawRect(framingRect.left + 2, height - 1, framingRect.right - 1, height + 2, this.mLaserPaint);
        postInvalidateDelayed(80L, framingRect.left - 10, framingRect.top - 10, framingRect.right + 10, framingRect.bottom + 10);
    }

    public void drawViewFinderBorder(Canvas canvas) {
        Rect framingRect = getFramingRect();
        int i = framingRect.left;
        int i2 = framingRect.top;
        canvas.drawLine(i, i2 - 1, i, (i2 - 1) + this.mBorderLineLength, this.mBorderPaint);
        int i3 = framingRect.left;
        int i4 = framingRect.top;
        canvas.drawLine(i3 - 1, i4 - 1, (i3 - 1) + this.mBorderLineLength, i4 - 1, this.mBorderPaint);
        int i5 = framingRect.left;
        int i6 = framingRect.bottom;
        canvas.drawLine(i5, i6 + 1, i5, (i6 + 1) - this.mBorderLineLength, this.mBorderPaint);
        int i7 = framingRect.left;
        int i8 = framingRect.bottom;
        canvas.drawLine(i7 - 1, i8 + 1, (i7 - 1) + this.mBorderLineLength, i8 + 1, this.mBorderPaint);
        int i9 = framingRect.right;
        int i10 = framingRect.top;
        canvas.drawLine(i9 + 1, i10 - 1, i9 + 1, (i10 - 1) + this.mBorderLineLength, this.mBorderPaint);
        int i11 = framingRect.right;
        int i12 = framingRect.top;
        canvas.drawLine(i11 + 1, i12 - 1, (i11 + 1) - this.mBorderLineLength, i12 - 1, this.mBorderPaint);
        int i13 = framingRect.right;
        int i14 = framingRect.bottom;
        canvas.drawLine(i13 + 1, i14 + 1, i13 + 1, (i14 + 1) - this.mBorderLineLength, this.mBorderPaint);
        int i15 = framingRect.right;
        int i16 = framingRect.bottom;
        canvas.drawLine(i15 + 1, i16 + 1, (i15 + 1) - this.mBorderLineLength, i16 + 1, this.mBorderPaint);
    }

    public void drawViewFinderMask(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        Rect framingRect = getFramingRect();
        float f = width;
        canvas.drawRect(0.0f, 0.0f, f, framingRect.top, this.mFinderMaskPaint);
        canvas.drawRect(0.0f, framingRect.top, framingRect.left, framingRect.bottom + 1, this.mFinderMaskPaint);
        canvas.drawRect(framingRect.right + 1, framingRect.top, f, framingRect.bottom + 1, this.mFinderMaskPaint);
        canvas.drawRect(0.0f, framingRect.bottom + 1, f, height, this.mFinderMaskPaint);
    }

    @Override // me.dm7.barcodescanner.core.IViewFinder
    public Rect getFramingRect() {
        return this.f71962a;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getFramingRect() == null) {
            return;
        }
        drawViewFinderMask(canvas);
        drawLaser(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        updateFramingRect();
    }

    public void setBorderColor(int i) {
        this.mBorderPaint.setColor(i);
    }

    public void setBorderLineLength(int i) {
        this.mBorderLineLength = i;
    }

    public void setBorderStrokeWidth(int i) {
        this.mBorderPaint.setStrokeWidth(i);
    }

    public void setLaserColor(int i) {
        this.mLaserPaint.setColor(i);
    }

    public void setMaskColor(int i) {
        this.mFinderMaskPaint.setColor(i);
    }

    public void setSquareViewFinder(boolean z) {
        this.mSquareViewFinder = z;
    }

    @Override // me.dm7.barcodescanner.core.IViewFinder
    public void setupViewFinder() {
        updateFramingRect();
        invalidate();
    }

    public synchronized void updateFramingRect() {
        int width;
        int i;
        int width2;
        try {
            Point point = new Point(getWidth(), getHeight());
            int screenOrientation = DisplayUtils.getScreenOrientation(getContext());
            if (this.mSquareViewFinder) {
                if (screenOrientation != 1) {
                    width2 = getHeight();
                } else {
                    width2 = getWidth();
                }
                width = (int) (width2 * 0.625f);
                i = width;
            } else if (screenOrientation != 1) {
                int height = (int) (getHeight() * 0.625f);
                i = height;
                width = (int) (height * 1.4f);
            } else {
                width = (int) (getWidth() * 0.75f);
                i = (int) (width * 0.75f);
            }
            if (width > getWidth()) {
                getWidth();
            }
            if (i > getHeight()) {
                i = getHeight() - 50;
            }
            int i2 = i / 2;
            int i3 = (point.y - i2) / 2;
            this.f71962a = new Rect(0, i3, point.x, i2 + i3);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public ViewFinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f71964c = getResources().getColor(R.color.viewfinder_laser);
        this.f71965d = getResources().getColor(R.color.viewfinder_mask);
        this.f71966e = getResources().getColor(R.color.viewfinder_border);
        this.f71967f = getResources().getInteger(R.integer.viewfinder_border_width);
        this.f71968g = getResources().getInteger(R.integer.viewfinder_border_length);
        m26235a();
    }
}
