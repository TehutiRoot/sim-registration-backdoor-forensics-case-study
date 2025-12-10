package androidx.core.app;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class RemoteInput {
    public static final int EDIT_CHOICES_BEFORE_SENDING_AUTO = 0;
    public static final int EDIT_CHOICES_BEFORE_SENDING_DISABLED = 1;
    public static final int EDIT_CHOICES_BEFORE_SENDING_ENABLED = 2;
    public static final String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
    public static final String RESULTS_CLIP_LABEL = "android.remoteinput.results";
    public static final int SOURCE_CHOICE = 1;
    public static final int SOURCE_FREE_FORM_INPUT = 0;

    /* renamed from: a */
    public final String f33781a;

    /* renamed from: b */
    public final CharSequence f33782b;

    /* renamed from: c */
    public final CharSequence[] f33783c;

    /* renamed from: d */
    public final boolean f33784d;

    /* renamed from: e */
    public final int f33785e;

    /* renamed from: f */
    public final Bundle f33786f;

    /* renamed from: g */
    public final Set f33787g;

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a */
        public final String f33788a;

        /* renamed from: d */
        public CharSequence f33791d;

        /* renamed from: e */
        public CharSequence[] f33792e;

        /* renamed from: b */
        public final Set f33789b = new HashSet();

        /* renamed from: c */
        public final Bundle f33790c = new Bundle();

        /* renamed from: f */
        public boolean f33793f = true;

        /* renamed from: g */
        public int f33794g = 0;

        public Builder(@NonNull String str) {
            if (str != null) {
                this.f33788a = str;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }

        @NonNull
        public Builder addExtras(@NonNull Bundle bundle) {
            if (bundle != null) {
                this.f33790c.putAll(bundle);
            }
            return this;
        }

        @NonNull
        public RemoteInput build() {
            return new RemoteInput(this.f33788a, this.f33791d, this.f33792e, this.f33793f, this.f33794g, this.f33790c, this.f33789b);
        }

        @NonNull
        public Bundle getExtras() {
            return this.f33790c;
        }

        @NonNull
        public Builder setAllowDataType(@NonNull String str, boolean z) {
            if (z) {
                this.f33789b.add(str);
            } else {
                this.f33789b.remove(str);
            }
            return this;
        }

        @NonNull
        public Builder setAllowFreeFormInput(boolean z) {
            this.f33793f = z;
            return this;
        }

        @NonNull
        public Builder setChoices(@Nullable CharSequence[] charSequenceArr) {
            this.f33792e = charSequenceArr;
            return this;
        }

        @NonNull
        public Builder setEditChoicesBeforeSending(int i) {
            this.f33794g = i;
            return this;
        }

        @NonNull
        public Builder setLabel(@Nullable CharSequence charSequence) {
            this.f33791d = charSequence;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface EditChoicesBeforeSending {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface Source {
    }

    /* renamed from: androidx.core.app.RemoteInput$a */
    /* loaded from: classes2.dex */
    public static class C3903a {
        @DoNotInline
        /* renamed from: a */
        public static ClipData m57592a(Intent intent) {
            return intent.getClipData();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m57591b(Intent intent, ClipData clipData) {
            intent.setClipData(clipData);
        }
    }

    /* renamed from: androidx.core.app.RemoteInput$b */
    /* loaded from: classes2.dex */
    public static class C3904b {
        @DoNotInline
        /* renamed from: a */
        public static void m57590a(Object obj, Intent intent, Bundle bundle) {
            android.app.RemoteInput.addResultsToIntent((android.app.RemoteInput[]) obj, intent, bundle);
        }

        /* renamed from: b */
        public static android.app.RemoteInput m57589b(RemoteInput remoteInput) {
            Set<String> allowedDataTypes;
            RemoteInput.Builder addExtras = new RemoteInput.Builder(remoteInput.getResultKey()).setLabel(remoteInput.getLabel()).setChoices(remoteInput.getChoices()).setAllowFreeFormInput(remoteInput.getAllowFreeFormInput()).addExtras(remoteInput.getExtras());
            if (Build.VERSION.SDK_INT >= 26 && (allowedDataTypes = remoteInput.getAllowedDataTypes()) != null) {
                for (String str : allowedDataTypes) {
                    C3905c.m57583d(addExtras, str, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                C3907e.m57579b(addExtras, remoteInput.getEditChoicesBeforeSending());
            }
            return addExtras.build();
        }

        /* renamed from: c */
        public static RemoteInput m57588c(Object obj) {
            Set<String> m57585b;
            android.app.RemoteInput remoteInput = (android.app.RemoteInput) obj;
            Builder addExtras = new Builder(remoteInput.getResultKey()).setLabel(remoteInput.getLabel()).setChoices(remoteInput.getChoices()).setAllowFreeFormInput(remoteInput.getAllowFreeFormInput()).addExtras(remoteInput.getExtras());
            if (Build.VERSION.SDK_INT >= 26 && (m57585b = C3905c.m57585b(remoteInput)) != null) {
                for (String str : m57585b) {
                    addExtras.setAllowDataType(str, true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                addExtras.setEditChoicesBeforeSending(C3907e.m57580a(remoteInput));
            }
            return addExtras.build();
        }

        @DoNotInline
        /* renamed from: d */
        public static Bundle m57587d(Intent intent) {
            return android.app.RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* renamed from: androidx.core.app.RemoteInput$c */
    /* loaded from: classes2.dex */
    public static class C3905c {
        @DoNotInline
        /* renamed from: a */
        public static void m57586a(RemoteInput remoteInput, Intent intent, Map<String, Uri> map) {
            android.app.RemoteInput.addDataResultToIntent(RemoteInput.m57597a(remoteInput), intent, map);
        }

        @DoNotInline
        /* renamed from: b */
        public static Set<String> m57585b(Object obj) {
            return ((android.app.RemoteInput) obj).getAllowedDataTypes();
        }

        @DoNotInline
        /* renamed from: c */
        public static Map<String, Uri> m57584c(Intent intent, String str) {
            return android.app.RemoteInput.getDataResultsFromIntent(intent, str);
        }

        @DoNotInline
        /* renamed from: d */
        public static RemoteInput.Builder m57583d(RemoteInput.Builder builder, String str, boolean z) {
            return builder.setAllowDataType(str, z);
        }
    }

    /* renamed from: androidx.core.app.RemoteInput$d */
    /* loaded from: classes2.dex */
    public static class C3906d {
        @DoNotInline
        /* renamed from: a */
        public static int m57582a(Intent intent) {
            return android.app.RemoteInput.getResultsSource(intent);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m57581b(Intent intent, int i) {
            android.app.RemoteInput.setResultsSource(intent, i);
        }
    }

    /* renamed from: androidx.core.app.RemoteInput$e */
    /* loaded from: classes2.dex */
    public static class C3907e {
        @DoNotInline
        /* renamed from: a */
        public static int m57580a(Object obj) {
            return ((android.app.RemoteInput) obj).getEditChoicesBeforeSending();
        }

        @DoNotInline
        /* renamed from: b */
        public static RemoteInput.Builder m57579b(RemoteInput.Builder builder, int i) {
            return builder.setEditChoicesBeforeSending(i);
        }
    }

    public RemoteInput(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, Set set) {
        this.f33781a = str;
        this.f33782b = charSequence;
        this.f33783c = charSequenceArr;
        this.f33784d = z;
        this.f33785e = i;
        this.f33786f = bundle;
        this.f33787g = set;
        if (getEditChoicesBeforeSending() == 2 && !getAllowFreeFormInput()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    /* renamed from: a */
    public static android.app.RemoteInput m57597a(RemoteInput remoteInput) {
        return C3904b.m57589b(remoteInput);
    }

    public static void addDataResultToIntent(@NonNull RemoteInput remoteInput, @NonNull Intent intent, @NonNull Map<String, Uri> map) {
        if (Build.VERSION.SDK_INT >= 26) {
            C3905c.m57586a(remoteInput, intent, map);
            return;
        }
        Intent m57594d = m57594d(intent);
        if (m57594d == null) {
            m57594d = new Intent();
        }
        for (Map.Entry<String, Uri> entry : map.entrySet()) {
            String key = entry.getKey();
            Uri value = entry.getValue();
            if (key != null) {
                Bundle bundleExtra = m57594d.getBundleExtra(m57593e(key));
                if (bundleExtra == null) {
                    bundleExtra = new Bundle();
                }
                bundleExtra.putString(remoteInput.getResultKey(), value.toString());
                m57594d.putExtra(m57593e(key), bundleExtra);
            }
        }
        C3903a.m57591b(intent, ClipData.newIntent(RESULTS_CLIP_LABEL, m57594d));
    }

    public static void addResultsToIntent(@NonNull RemoteInput[] remoteInputArr, @NonNull Intent intent, @NonNull Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            C3904b.m57590a(m57596b(remoteInputArr), intent, bundle);
            return;
        }
        Bundle resultsFromIntent = getResultsFromIntent(intent);
        int resultsSource = getResultsSource(intent);
        if (resultsFromIntent != null) {
            resultsFromIntent.putAll(bundle);
            bundle = resultsFromIntent;
        }
        for (RemoteInput remoteInput : remoteInputArr) {
            Map<String, Uri> dataResultsFromIntent = getDataResultsFromIntent(intent, remoteInput.getResultKey());
            C3904b.m57590a(m57596b(new RemoteInput[]{remoteInput}), intent, bundle);
            if (dataResultsFromIntent != null) {
                addDataResultToIntent(remoteInput, intent, dataResultsFromIntent);
            }
        }
        setResultsSource(intent, resultsSource);
    }

    /* renamed from: b */
    public static android.app.RemoteInput[] m57596b(RemoteInput[] remoteInputArr) {
        if (remoteInputArr == null) {
            return null;
        }
        android.app.RemoteInput[] remoteInputArr2 = new android.app.RemoteInput[remoteInputArr.length];
        for (int i = 0; i < remoteInputArr.length; i++) {
            remoteInputArr2[i] = m57597a(remoteInputArr[i]);
        }
        return remoteInputArr2;
    }

    /* renamed from: c */
    public static RemoteInput m57595c(android.app.RemoteInput remoteInput) {
        return C3904b.m57588c(remoteInput);
    }

    /* renamed from: d */
    public static Intent m57594d(Intent intent) {
        ClipData m57592a = C3903a.m57592a(intent);
        if (m57592a == null) {
            return null;
        }
        ClipDescription description = m57592a.getDescription();
        if (!description.hasMimeType("text/vnd.android.intent") || !description.getLabel().toString().contentEquals(RESULTS_CLIP_LABEL)) {
            return null;
        }
        return m57592a.getItemAt(0).getIntent();
    }

    /* renamed from: e */
    public static String m57593e(String str) {
        return "android.remoteinput.dataTypeResultsData" + str;
    }

    @Nullable
    public static Map<String, Uri> getDataResultsFromIntent(@NonNull Intent intent, @NonNull String str) {
        String string;
        if (Build.VERSION.SDK_INT >= 26) {
            return C3905c.m57584c(intent, str);
        }
        Intent m57594d = m57594d(intent);
        if (m57594d == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : m57594d.getExtras().keySet()) {
            if (str2.startsWith("android.remoteinput.dataTypeResultsData")) {
                String substring = str2.substring(39);
                if (!substring.isEmpty() && (string = m57594d.getBundleExtra(str2).getString(str)) != null && !string.isEmpty()) {
                    hashMap.put(substring, Uri.parse(string));
                }
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    @Nullable
    public static Bundle getResultsFromIntent(@NonNull Intent intent) {
        return C3904b.m57587d(intent);
    }

    public static int getResultsSource(@NonNull Intent intent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C3906d.m57582a(intent);
        }
        Intent m57594d = m57594d(intent);
        if (m57594d == null) {
            return 0;
        }
        return m57594d.getExtras().getInt("android.remoteinput.resultsSource", 0);
    }

    public static void setResultsSource(@NonNull Intent intent, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            C3906d.m57581b(intent, i);
            return;
        }
        Intent m57594d = m57594d(intent);
        if (m57594d == null) {
            m57594d = new Intent();
        }
        m57594d.putExtra("android.remoteinput.resultsSource", i);
        C3903a.m57591b(intent, ClipData.newIntent(RESULTS_CLIP_LABEL, m57594d));
    }

    public boolean getAllowFreeFormInput() {
        return this.f33784d;
    }

    @Nullable
    public Set<String> getAllowedDataTypes() {
        return this.f33787g;
    }

    @Nullable
    public CharSequence[] getChoices() {
        return this.f33783c;
    }

    public int getEditChoicesBeforeSending() {
        return this.f33785e;
    }

    @NonNull
    public Bundle getExtras() {
        return this.f33786f;
    }

    @Nullable
    public CharSequence getLabel() {
        return this.f33782b;
    }

    @NonNull
    public String getResultKey() {
        return this.f33781a;
    }

    public boolean isDataOnly() {
        if (!getAllowFreeFormInput() && ((getChoices() == null || getChoices().length == 0) && getAllowedDataTypes() != null && !getAllowedDataTypes().isEmpty())) {
            return true;
        }
        return false;
    }
}