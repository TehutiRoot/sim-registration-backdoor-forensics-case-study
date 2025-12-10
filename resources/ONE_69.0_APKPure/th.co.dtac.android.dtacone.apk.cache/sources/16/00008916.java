package com.github.gcacace.signaturepad.utils;

import androidx.databinding.BindingAdapter;
import com.github.gcacace.signaturepad.views.SignaturePad;

/* loaded from: classes3.dex */
public final class SignaturePadBindingAdapter {

    /* loaded from: classes3.dex */
    public interface OnClearListener {
        void onClear();
    }

    /* loaded from: classes3.dex */
    public interface OnSignedListener {
        void onSigned();
    }

    /* loaded from: classes3.dex */
    public interface OnStartSigningListener {
        void onStartSigning();
    }

    /* renamed from: com.github.gcacace.signaturepad.utils.SignaturePadBindingAdapter$a */
    /* loaded from: classes3.dex */
    public class C6168a implements SignaturePad.OnSignedListener {

        /* renamed from: a */
        public final /* synthetic */ OnStartSigningListener f43759a;

        /* renamed from: b */
        public final /* synthetic */ OnSignedListener f43760b;

        /* renamed from: c */
        public final /* synthetic */ OnClearListener f43761c;

        public C6168a(OnStartSigningListener onStartSigningListener, OnSignedListener onSignedListener, OnClearListener onClearListener) {
            this.f43759a = onStartSigningListener;
            this.f43760b = onSignedListener;
            this.f43761c = onClearListener;
        }

        @Override // com.github.gcacace.signaturepad.views.SignaturePad.OnSignedListener
        public void onClear() {
            OnClearListener onClearListener = this.f43761c;
            if (onClearListener != null) {
                onClearListener.onClear();
            }
        }

        @Override // com.github.gcacace.signaturepad.views.SignaturePad.OnSignedListener
        public void onSigned() {
            OnSignedListener onSignedListener = this.f43760b;
            if (onSignedListener != null) {
                onSignedListener.onSigned();
            }
        }

        @Override // com.github.gcacace.signaturepad.views.SignaturePad.OnSignedListener
        public void onStartSigning() {
            OnStartSigningListener onStartSigningListener = this.f43759a;
            if (onStartSigningListener != null) {
                onStartSigningListener.onStartSigning();
            }
        }
    }

    @BindingAdapter({"onStartSigning"})
    public static void setOnSignedListener(SignaturePad signaturePad, OnStartSigningListener onStartSigningListener) {
        setOnSignedListener(signaturePad, onStartSigningListener, null, null);
    }

    @BindingAdapter({"onSigned"})
    public static void setOnSignedListener(SignaturePad signaturePad, OnSignedListener onSignedListener) {
        setOnSignedListener(signaturePad, null, onSignedListener, null);
    }

    @BindingAdapter({"onClear"})
    public static void setOnSignedListener(SignaturePad signaturePad, OnClearListener onClearListener) {
        setOnSignedListener(signaturePad, null, null, onClearListener);
    }

    @BindingAdapter(requireAll = false, value = {"onStartSigning", "onSigned", "onClear"})
    public static void setOnSignedListener(SignaturePad signaturePad, OnStartSigningListener onStartSigningListener, OnSignedListener onSignedListener, OnClearListener onClearListener) {
        signaturePad.setOnSignedListener(new C6168a(onStartSigningListener, onSignedListener, onClearListener));
    }
}