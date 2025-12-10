package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class InputContentInfoCompat {

    /* renamed from: a */
    public final InterfaceC4208c f34334a;

    /* renamed from: androidx.core.view.inputmethod.InputContentInfoCompat$b */
    /* loaded from: classes2.dex */
    public static final class C4207b implements InterfaceC4208c {

        /* renamed from: a */
        public final Uri f34336a;

        /* renamed from: b */
        public final ClipDescription f34337b;

        /* renamed from: c */
        public final Uri f34338c;

        public C4207b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f34336a = uri;
            this.f34337b = clipDescription;
            this.f34338c = uri2;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InterfaceC4208c
        /* renamed from: a */
        public Uri mo56573a() {
            return this.f34338c;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InterfaceC4208c
        /* renamed from: b */
        public Object mo56572b() {
            return null;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InterfaceC4208c
        /* renamed from: c */
        public Uri mo56571c() {
            return this.f34336a;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InterfaceC4208c
        /* renamed from: d */
        public void mo56570d() {
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InterfaceC4208c
        /* renamed from: e */
        public void mo56569e() {
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InterfaceC4208c
        public ClipDescription getDescription() {
            return this.f34337b;
        }
    }

    /* renamed from: androidx.core.view.inputmethod.InputContentInfoCompat$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC4208c {
        /* renamed from: a */
        Uri mo56573a();

        /* renamed from: b */
        Object mo56572b();

        /* renamed from: c */
        Uri mo56571c();

        /* renamed from: d */
        void mo56570d();

        /* renamed from: e */
        void mo56569e();

        ClipDescription getDescription();
    }

    public InputContentInfoCompat(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f34334a = new C4206a(uri, clipDescription, uri2);
        } else {
            this.f34334a = new C4207b(uri, clipDescription, uri2);
        }
    }

    @Nullable
    public static InputContentInfoCompat wrap(@Nullable Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 25) {
            return null;
        }
        return new InputContentInfoCompat(new C4206a(obj));
    }

    @NonNull
    public Uri getContentUri() {
        return this.f34334a.mo56571c();
    }

    @NonNull
    public ClipDescription getDescription() {
        return this.f34334a.getDescription();
    }

    @Nullable
    public Uri getLinkUri() {
        return this.f34334a.mo56573a();
    }

    public void releasePermission() {
        this.f34334a.mo56569e();
    }

    public void requestPermission() {
        this.f34334a.mo56570d();
    }

    @Nullable
    public Object unwrap() {
        return this.f34334a.mo56572b();
    }

    /* renamed from: androidx.core.view.inputmethod.InputContentInfoCompat$a */
    /* loaded from: classes2.dex */
    public static final class C4206a implements InterfaceC4208c {

        /* renamed from: a */
        public final InputContentInfo f34335a;

        public C4206a(Object obj) {
            this.f34335a = (InputContentInfo) obj;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InterfaceC4208c
        /* renamed from: a */
        public Uri mo56573a() {
            return this.f34335a.getLinkUri();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InterfaceC4208c
        /* renamed from: b */
        public Object mo56572b() {
            return this.f34335a;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InterfaceC4208c
        /* renamed from: c */
        public Uri mo56571c() {
            return this.f34335a.getContentUri();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InterfaceC4208c
        /* renamed from: d */
        public void mo56570d() {
            this.f34335a.requestPermission();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InterfaceC4208c
        /* renamed from: e */
        public void mo56569e() {
            this.f34335a.releasePermission();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InterfaceC4208c
        public ClipDescription getDescription() {
            return this.f34335a.getDescription();
        }

        public C4206a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f34335a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public InputContentInfoCompat(InterfaceC4208c interfaceC4208c) {
        this.f34334a = interfaceC4208c;
    }
}
