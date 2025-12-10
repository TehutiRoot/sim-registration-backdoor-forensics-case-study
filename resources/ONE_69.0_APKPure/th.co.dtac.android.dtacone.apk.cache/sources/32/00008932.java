package com.google.android.cameraview;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.p005os.ParcelableCompat;
import androidx.core.p005os.ParcelableCompatCreatorCallbacks;
import androidx.core.view.ViewCompat;
import com.google.android.cameraview.AbstractC6196d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

/* loaded from: classes3.dex */
public class CameraView extends FrameLayout {
    public static final int FACING_BACK = 0;
    public static final int FACING_FRONT = 1;
    public static final int FLASH_AUTO = 3;
    public static final int FLASH_OFF = 0;
    public static final int FLASH_ON = 1;
    public static final int FLASH_RED_EYE = 4;
    public static final int FLASH_TORCH = 2;

    /* renamed from: a */
    public AbstractC6196d f43813a;

    /* renamed from: b */
    public final C6180b f43814b;

    /* renamed from: c */
    public boolean f43815c;

    /* renamed from: d */
    public final AbstractC12429oJ f43816d;

    /* loaded from: classes3.dex */
    public static abstract class Callback {
        public void onCameraClosed(CameraView cameraView) {
        }

        public void onCameraOpened(CameraView cameraView) {
        }

        public void onPictureTaken(CameraView cameraView, byte[] bArr) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Facing {
    }

    /* loaded from: classes3.dex */
    public @interface Flash {
    }

    /* renamed from: com.google.android.cameraview.CameraView$a */
    /* loaded from: classes3.dex */
    public class C6179a extends AbstractC12429oJ {
        public C6179a(Context context) {
            super(context);
        }

        @Override // p000.AbstractC12429oJ
        /* renamed from: e */
        public void mo26132e(int i) {
            CameraView.this.f43813a.mo49190j(i);
        }
    }

    /* renamed from: com.google.android.cameraview.CameraView$b */
    /* loaded from: classes3.dex */
    public class C6180b implements AbstractC6196d.InterfaceC6197a {

        /* renamed from: a */
        public final ArrayList f43822a = new ArrayList();

        /* renamed from: b */
        public boolean f43823b;

        public C6180b() {
        }

        @Override // com.google.android.cameraview.AbstractC6196d.InterfaceC6197a
        /* renamed from: a */
        public void mo49184a() {
            Iterator it = this.f43822a.iterator();
            while (it.hasNext()) {
                ((Callback) it.next()).onCameraClosed(CameraView.this);
            }
        }

        @Override // com.google.android.cameraview.AbstractC6196d.InterfaceC6197a
        /* renamed from: b */
        public void mo49183b() {
            if (this.f43823b) {
                this.f43823b = false;
                CameraView.this.requestLayout();
            }
            Iterator it = this.f43822a.iterator();
            while (it.hasNext()) {
                ((Callback) it.next()).onCameraOpened(CameraView.this);
            }
        }

        /* renamed from: c */
        public void m49239c(Callback callback) {
            this.f43822a.add(callback);
        }

        /* renamed from: d */
        public void m49238d(Callback callback) {
            this.f43822a.remove(callback);
        }

        /* renamed from: e */
        public void m49237e() {
            this.f43823b = true;
        }

        @Override // com.google.android.cameraview.AbstractC6196d.InterfaceC6197a
        public void onPictureTaken(byte[] bArr) {
            Iterator it = this.f43822a.iterator();
            while (it.hasNext()) {
                ((Callback) it.next()).onPictureTaken(CameraView.this, bArr);
            }
        }
    }

    public CameraView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final AbstractC6198e m49242a(Context context) {
        return new C6200f(context, this);
    }

    public void addCallback(@NonNull Callback callback) {
        this.f43814b.m49239c(callback);
    }

    public boolean getAdjustViewBounds() {
        return this.f43815c;
    }

    @Nullable
    public AspectRatio getAspectRatio() {
        return this.f43813a.mo49199a();
    }

    public boolean getAutoFocus() {
        return this.f43813a.mo49198b();
    }

    public int getFacing() {
        return this.f43813a.mo49197c();
    }

    @Flash
    public int getFlash() {
        return this.f43813a.mo49196d();
    }

    public Set<AspectRatio> getSupportedAspectRatios() {
        return this.f43813a.mo49195e();
    }

    public boolean isCameraOpened() {
        return this.f43813a.mo49193g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            this.f43816d.m26134c(ViewCompat.getDisplay(this));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.f43816d.m26136a();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (isInEditMode()) {
            super.onMeasure(i, i2);
            return;
        }
        if (this.f43815c) {
            if (!isCameraOpened()) {
                this.f43814b.m49237e();
                super.onMeasure(i, i2);
                return;
            }
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode == 1073741824 && mode2 != 1073741824) {
                int size = (int) (View.MeasureSpec.getSize(i) * getAspectRatio().toFloat());
                if (mode2 == Integer.MIN_VALUE) {
                    size = Math.min(size, View.MeasureSpec.getSize(i2));
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            } else if (mode != 1073741824 && mode2 == 1073741824) {
                int size2 = (int) (View.MeasureSpec.getSize(i2) * getAspectRatio().toFloat());
                if (mode == Integer.MIN_VALUE) {
                    size2 = Math.min(size2, View.MeasureSpec.getSize(i));
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), i2);
            } else {
                super.onMeasure(i, i2);
            }
        } else {
            super.onMeasure(i, i2);
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        AspectRatio aspectRatio = getAspectRatio();
        if (this.f43816d.m26133d() % BitmapUtil.IMAGE_180_DEGREE == 0) {
            aspectRatio = aspectRatio.inverse();
        }
        if (measuredHeight < (aspectRatio.getY() * measuredWidth) / aspectRatio.getX()) {
            this.f43813a.m49194f().measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec((measuredWidth * aspectRatio.getY()) / aspectRatio.getX(), 1073741824));
        } else {
            this.f43813a.m49194f().measure(View.MeasureSpec.makeMeasureSpec((aspectRatio.getX() * measuredHeight) / aspectRatio.getY(), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setFacing(savedState.f43817a);
        setAspectRatio(savedState.f43818b);
        setAutoFocus(savedState.f43819c);
        setFlash(savedState.f43820d);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f43817a = getFacing();
        savedState.f43818b = getAspectRatio();
        savedState.f43819c = getAutoFocus();
        savedState.f43820d = getFlash();
        return savedState;
    }

    public void removeCallback(@NonNull Callback callback) {
        this.f43814b.m49238d(callback);
    }

    public void setAdjustViewBounds(boolean z) {
        if (this.f43815c != z) {
            this.f43815c = z;
            requestLayout();
        }
    }

    public void setAspectRatio(@NonNull AspectRatio aspectRatio) {
        if (this.f43813a.mo49192h(aspectRatio)) {
            requestLayout();
        }
    }

    public void setAutoFocus(boolean z) {
        this.f43813a.mo49191i(z);
    }

    public void setFacing(int i) {
        this.f43813a.mo49189k(i);
    }

    public void setFlash(@Flash int i) {
        this.f43813a.mo49188l(i);
    }

    public void start() {
        if (!this.f43813a.mo49187m()) {
            Parcelable onSaveInstanceState = onSaveInstanceState();
            this.f43813a = new C6185a(this.f43814b, m49242a(getContext()));
            onRestoreInstanceState(onSaveInstanceState);
            this.f43813a.mo49187m();
        }
    }

    public void stop() {
        this.f43813a.mo49186n();
    }

    public void takePicture() {
        this.f43813a.mo49185o();
    }

    public CameraView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CameraView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            this.f43814b = null;
            this.f43816d = null;
            return;
        }
        AbstractC6198e m49242a = m49242a(context);
        C6180b c6180b = new C6180b();
        this.f43814b = c6180b;
        if (Build.VERSION.SDK_INT < 23) {
            this.f43813a = new C6187b(c6180b, m49242a, context);
        } else {
            this.f43813a = new C6195c(c6180b, m49242a, context);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CameraView, i, R.style.Widget_CameraView);
        this.f43815c = obtainStyledAttributes.getBoolean(R.styleable.CameraView_android_adjustViewBounds, false);
        setFacing(obtainStyledAttributes.getInt(R.styleable.CameraView_facing, 0));
        String string = obtainStyledAttributes.getString(R.styleable.CameraView_aspectRatio);
        if (string != null) {
            setAspectRatio(AspectRatio.parse(string));
        } else {
            setAspectRatio(InterfaceC12316mx.f72213a);
        }
        setAutoFocus(obtainStyledAttributes.getBoolean(R.styleable.CameraView_autoFocus, true));
        setFlash(obtainStyledAttributes.getInt(R.styleable.CameraView_flash, 3));
        obtainStyledAttributes.recycle();
        this.f43816d = new C6179a(context);
    }

    /* loaded from: classes3.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = ParcelableCompat.newCreator(new C6178a());

        /* renamed from: a */
        public int f43817a;

        /* renamed from: b */
        public AspectRatio f43818b;

        /* renamed from: c */
        public boolean f43819c;

        /* renamed from: d */
        public int f43820d;

        /* renamed from: com.google.android.cameraview.CameraView$SavedState$a */
        /* loaded from: classes3.dex */
        public class C6178a implements ParcelableCompatCreatorCallbacks {
            @Override // androidx.core.p005os.ParcelableCompatCreatorCallbacks
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // androidx.core.p005os.ParcelableCompatCreatorCallbacks
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            this.f43817a = parcel.readInt();
            this.f43818b = (AspectRatio) parcel.readParcelable(classLoader);
            this.f43819c = parcel.readByte() != 0;
            this.f43820d = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f43817a);
            parcel.writeParcelable(this.f43818b, 0);
            parcel.writeByte(this.f43819c ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f43820d);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}