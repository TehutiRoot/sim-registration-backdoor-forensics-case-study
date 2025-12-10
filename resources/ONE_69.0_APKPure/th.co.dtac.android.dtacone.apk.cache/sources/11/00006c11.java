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
    public final InterfaceC4190c f34422a;

    /* renamed from: androidx.core.view.inputmethod.InputContentInfoCompat$b */
    /* loaded from: classes2.dex */
    public static final class C4189b implements InterfaceC4190c {

        /* renamed from: a */
        public final Uri f34424a;

        /* renamed from: b */
        public final ClipDescription f34425b;

        /* renamed from: c */
        public final Uri f34426c;

        public C4189b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f34424a = uri;
            this.f34425b = clipDescription;
            this.f34426c = uri2;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InterfaceC4190c
        /* renamed from: a */
        public Uri mo56523a() {
            return this.f34426c;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InterfaceC4190c
        /* renamed from: b */
        public Object mo56522b() {
            return null;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InterfaceC4190c
        /* renamed from: c */
        public Uri mo56521c() {
            return this.f34424a;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InterfaceC4190c
        /* renamed from: d */
        public void mo56520d() {
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InterfaceC4190c
        /* renamed from: e */
        public void mo56519e() {
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InterfaceC4190c
        public ClipDescription getDescription() {
            return this.f34425b;
        }
    }

    /* renamed from: androidx.core.view.inputmethod.InputContentInfoCompat$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC4190c {
        /* renamed from: a */
        Uri mo56523a();

        /* renamed from: b */
        Object mo56522b();

        /* renamed from: c */
        Uri mo56521c();

        /* renamed from: d */
        void mo56520d();

        /* renamed from: e */
        void mo56519e();

        ClipDescription getDescription();
    }

    public InputContentInfoCompat(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f34422a = new C4188a(uri, clipDescription, uri2);
        } else {
            this.f34422a = new C4189b(uri, clipDescription, uri2);
        }
    }

    @Nullable
    public static InputContentInfoCompat wrap(@Nullable Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 25) {
            return null;
        }
        return new InputContentInfoCompat(new C4188a(obj));
    }

    @NonNull
    public Uri getContentUri() {
        return this.f34422a.mo56521c();
    }

    @NonNull
    public ClipDescription getDescription() {
        return this.f34422a.getDescription();
    }

    @Nullable
    public Uri getLinkUri() {
        return this.f34422a.mo56523a();
    }

    public void releasePermission() {
        this.f34422a.mo56519e();
    }

    public void requestPermission() {
        this.f34422a.mo56520d();
    }

    @Nullable
    public Object unwrap() {
        return this.f34422a.mo56522b();
    }

    /* renamed from: androidx.core.view.inputmethod.InputContentInfoCompat$a */
    /* loaded from: classes2.dex */
    public static final class C4188a implements InterfaceC4190c {

        /* renamed from: a */
        public final InputContentInfo f34423a;

        public C4188a(Object obj) {
            this.f34423a = (InputContentInfo) obj;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InterfaceC4190c
        /* renamed from: a */
        public Uri mo56523a() {
            return this.f34423a.getLinkUri();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InterfaceC4190c
        /* renamed from: b */
        public Object mo56522b() {
            return this.f34423a;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InterfaceC4190c
        /* renamed from: c */
        public Uri mo56521c() {
            return this.f34423a.getContentUri();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InterfaceC4190c
        /* renamed from: d */
        public void mo56520d() {
            this.f34423a.requestPermission();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InterfaceC4190c
        /* renamed from: e */
        public void mo56519e() {
            this.f34423a.releasePermission();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InterfaceC4190c
        public ClipDescription getDescription() {
            return this.f34423a.getDescription();
        }

        public C4188a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f34423a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public InputContentInfoCompat(InterfaceC4190c interfaceC4190c) {
        this.f34422a = interfaceC4190c;
    }
}