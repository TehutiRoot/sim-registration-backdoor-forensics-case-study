package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes2.dex */
public final class InputConnectionCompat {
    public static final int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = 1;

    /* loaded from: classes2.dex */
    public interface OnCommitContentListener {
        boolean onCommitContent(@NonNull InputContentInfoCompat inputContentInfoCompat, int i, @Nullable Bundle bundle);
    }

    /* renamed from: androidx.core.view.inputmethod.InputConnectionCompat$a */
    /* loaded from: classes2.dex */
    public class C4203a extends InputConnectionWrapper {

        /* renamed from: a */
        public final /* synthetic */ OnCommitContentListener f34332a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4203a(InputConnection inputConnection, boolean z, OnCommitContentListener onCommitContentListener) {
            super(inputConnection, z);
            this.f34332a = onCommitContentListener;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.f34332a.onCommitContent(InputContentInfoCompat.wrap(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* renamed from: androidx.core.view.inputmethod.InputConnectionCompat$b */
    /* loaded from: classes2.dex */
    public class C4204b extends InputConnectionWrapper {

        /* renamed from: a */
        public final /* synthetic */ OnCommitContentListener f34333a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4204b(InputConnection inputConnection, boolean z, OnCommitContentListener onCommitContentListener) {
            super(inputConnection, z);
            this.f34333a = onCommitContentListener;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (InputConnectionCompat.m56576c(str, bundle, this.f34333a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* renamed from: androidx.core.view.inputmethod.InputConnectionCompat$c */
    /* loaded from: classes2.dex */
    public static class C4205c {
        @DoNotInline
        /* renamed from: a */
        public static boolean m56574a(InputConnection inputConnection, InputContentInfo inputContentInfo, int i, Bundle bundle) {
            return inputConnection.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m56578a(View view, InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        return m56575d(view, inputContentInfoCompat, i, bundle);
    }

    /* renamed from: b */
    public static OnCommitContentListener m56577b(final View view) {
        Preconditions.checkNotNull(view);
        return new OnCommitContentListener() { // from class: Le0
            @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
            public final boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
                return InputConnectionCompat.m56578a(view, inputContentInfoCompat, i, bundle);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: c */
    public static boolean m56576c(String str, Bundle bundle, OnCommitContentListener onCommitContentListener) {
        boolean z;
        String str2;
        ResultReceiver resultReceiver;
        ResultReceiver resultReceiver2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ?? r0 = 0;
        r0 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            z = false;
        } else if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            return false;
        } else {
            z = true;
        }
        if (z) {
            str2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
        } else {
            str2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
        }
        try {
            resultReceiver2 = (ResultReceiver) bundle.getParcelable(str2);
            if (z) {
                str3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
            } else {
                str3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
            }
        } catch (Throwable th2) {
            th = th2;
            resultReceiver = null;
        }
        try {
            Uri uri = (Uri) bundle.getParcelable(str3);
            if (z) {
                str4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
            } else {
                str4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
            }
            ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(str4);
            if (z) {
                str5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
            } else {
                str5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
            }
            Uri uri2 = (Uri) bundle.getParcelable(str5);
            if (z) {
                str6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
            } else {
                str6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
            }
            int i = bundle.getInt(str6);
            if (z) {
                str7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
            } else {
                str7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
            }
            Bundle bundle2 = (Bundle) bundle.getParcelable(str7);
            if (uri != null && clipDescription != null) {
                r0 = onCommitContentListener.onCommitContent(new InputContentInfoCompat(uri, clipDescription, uri2), i, bundle2);
            }
            if (resultReceiver2 != null) {
                resultReceiver2.send(r0, null);
            }
            return r0;
        } catch (Throwable th3) {
            th = th3;
            resultReceiver = resultReceiver2;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            }
            throw th;
        }
    }

    public static boolean commitContent(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo, @NonNull InputContentInfoCompat inputContentInfoCompat, int i, @Nullable Bundle bundle) {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (Build.VERSION.SDK_INT >= 25) {
            return C4205c.m56574a(inputConnection, AbstractC17913Ke0.m67604a(inputContentInfoCompat.unwrap()), i, bundle);
        }
        int m56587a = EditorInfoCompat.m56587a(editorInfo);
        if (m56587a != 2) {
            z = false;
            if (m56587a != 3 && m56587a != 4) {
                return false;
            }
        } else {
            z = true;
        }
        Bundle bundle2 = new Bundle();
        if (z) {
            str = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
        } else {
            str = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
        }
        bundle2.putParcelable(str, inputContentInfoCompat.getContentUri());
        if (z) {
            str2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
        } else {
            str2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
        }
        bundle2.putParcelable(str2, inputContentInfoCompat.getDescription());
        if (z) {
            str3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
        } else {
            str3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
        }
        bundle2.putParcelable(str3, inputContentInfoCompat.getLinkUri());
        if (z) {
            str4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
        } else {
            str4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
        }
        bundle2.putInt(str4, i);
        if (z) {
            str5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
        } else {
            str5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
        }
        bundle2.putParcelable(str5, bundle);
        if (z) {
            str6 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
        } else {
            str6 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
        }
        return inputConnection.performPrivateCommand(str6, bundle2);
    }

    @NonNull
    @Deprecated
    public static InputConnection createWrapper(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo, @NonNull OnCommitContentListener onCommitContentListener) {
        ObjectsCompat.requireNonNull(inputConnection, "inputConnection must be non-null");
        ObjectsCompat.requireNonNull(editorInfo, "editorInfo must be non-null");
        ObjectsCompat.requireNonNull(onCommitContentListener, "onCommitContentListener must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new C4203a(inputConnection, false, onCommitContentListener);
        }
        return EditorInfoCompat.getContentMimeTypes(editorInfo).length == 0 ? inputConnection : new C4204b(inputConnection, false, onCommitContentListener);
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m56575d(View view, InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                inputContentInfoCompat.requestPermission();
                InputContentInfo m67604a = AbstractC17913Ke0.m67604a(inputContentInfoCompat.unwrap());
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", m67604a);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        if (ViewCompat.performReceiveContent(view, new ContentInfoCompat.Builder(new ClipData(inputContentInfoCompat.getDescription(), new ClipData.Item(inputContentInfoCompat.getContentUri())), 2).setLinkUri(inputContentInfoCompat.getLinkUri()).setExtras(bundle).build()) != null) {
            return false;
        }
        return true;
    }

    @NonNull
    public static InputConnection createWrapper(@NonNull View view, @NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        return createWrapper(inputConnection, editorInfo, m56577b(view));
    }
}
