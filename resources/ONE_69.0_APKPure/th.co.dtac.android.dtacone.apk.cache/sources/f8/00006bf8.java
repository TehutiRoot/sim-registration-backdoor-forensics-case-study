package androidx.core.view.accessibility;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes2.dex */
public class AccessibilityRecordCompat {

    /* renamed from: a */
    public final AccessibilityRecord f34416a;

    /* renamed from: androidx.core.view.accessibility.AccessibilityRecordCompat$a */
    /* loaded from: classes2.dex */
    public static class C4178a {
        @DoNotInline
        /* renamed from: a */
        public static int m56565a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        @DoNotInline
        /* renamed from: b */
        public static int m56564b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m56563c(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollX(i);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m56562d(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    /* renamed from: androidx.core.view.accessibility.AccessibilityRecordCompat$b */
    /* loaded from: classes2.dex */
    public static class C4179b {
        @DoNotInline
        /* renamed from: a */
        public static void m56561a(AccessibilityRecord accessibilityRecord, View view, int i) {
            accessibilityRecord.setSource(view, i);
        }
    }

    @Deprecated
    public AccessibilityRecordCompat(Object obj) {
        this.f34416a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public static AccessibilityRecordCompat obtain(AccessibilityRecordCompat accessibilityRecordCompat) {
        return new AccessibilityRecordCompat(AccessibilityRecord.obtain(accessibilityRecordCompat.f34416a));
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityRecordCompat)) {
            return false;
        }
        AccessibilityRecordCompat accessibilityRecordCompat = (AccessibilityRecordCompat) obj;
        AccessibilityRecord accessibilityRecord = this.f34416a;
        if (accessibilityRecord == null) {
            if (accessibilityRecordCompat.f34416a == null) {
                return true;
            }
            return false;
        }
        return accessibilityRecord.equals(accessibilityRecordCompat.f34416a);
    }

    @Deprecated
    public int getAddedCount() {
        return this.f34416a.getAddedCount();
    }

    @Deprecated
    public CharSequence getBeforeText() {
        return this.f34416a.getBeforeText();
    }

    @Deprecated
    public CharSequence getClassName() {
        return this.f34416a.getClassName();
    }

    @Deprecated
    public CharSequence getContentDescription() {
        return this.f34416a.getContentDescription();
    }

    @Deprecated
    public int getCurrentItemIndex() {
        return this.f34416a.getCurrentItemIndex();
    }

    @Deprecated
    public int getFromIndex() {
        return this.f34416a.getFromIndex();
    }

    @Deprecated
    public Object getImpl() {
        return this.f34416a;
    }

    @Deprecated
    public int getItemCount() {
        return this.f34416a.getItemCount();
    }

    @Deprecated
    public int getMaxScrollX() {
        return getMaxScrollX(this.f34416a);
    }

    @Deprecated
    public int getMaxScrollY() {
        return getMaxScrollY(this.f34416a);
    }

    @Deprecated
    public Parcelable getParcelableData() {
        return this.f34416a.getParcelableData();
    }

    @Deprecated
    public int getRemovedCount() {
        return this.f34416a.getRemovedCount();
    }

    @Deprecated
    public int getScrollX() {
        return this.f34416a.getScrollX();
    }

    @Deprecated
    public int getScrollY() {
        return this.f34416a.getScrollY();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public AccessibilityNodeInfoCompat getSource() {
        return AccessibilityNodeInfoCompat.m56570l(this.f34416a.getSource());
    }

    @Deprecated
    public List<CharSequence> getText() {
        return this.f34416a.getText();
    }

    @Deprecated
    public int getToIndex() {
        return this.f34416a.getToIndex();
    }

    @Deprecated
    public int getWindowId() {
        return this.f34416a.getWindowId();
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f34416a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public boolean isChecked() {
        return this.f34416a.isChecked();
    }

    @Deprecated
    public boolean isEnabled() {
        return this.f34416a.isEnabled();
    }

    @Deprecated
    public boolean isFullScreen() {
        return this.f34416a.isFullScreen();
    }

    @Deprecated
    public boolean isPassword() {
        return this.f34416a.isPassword();
    }

    @Deprecated
    public boolean isScrollable() {
        return this.f34416a.isScrollable();
    }

    @Deprecated
    public void recycle() {
        this.f34416a.recycle();
    }

    @Deprecated
    public void setAddedCount(int i) {
        this.f34416a.setAddedCount(i);
    }

    @Deprecated
    public void setBeforeText(CharSequence charSequence) {
        this.f34416a.setBeforeText(charSequence);
    }

    @Deprecated
    public void setChecked(boolean z) {
        this.f34416a.setChecked(z);
    }

    @Deprecated
    public void setClassName(CharSequence charSequence) {
        this.f34416a.setClassName(charSequence);
    }

    @Deprecated
    public void setContentDescription(CharSequence charSequence) {
        this.f34416a.setContentDescription(charSequence);
    }

    @Deprecated
    public void setCurrentItemIndex(int i) {
        this.f34416a.setCurrentItemIndex(i);
    }

    @Deprecated
    public void setEnabled(boolean z) {
        this.f34416a.setEnabled(z);
    }

    @Deprecated
    public void setFromIndex(int i) {
        this.f34416a.setFromIndex(i);
    }

    @Deprecated
    public void setFullScreen(boolean z) {
        this.f34416a.setFullScreen(z);
    }

    @Deprecated
    public void setItemCount(int i) {
        this.f34416a.setItemCount(i);
    }

    @Deprecated
    public void setMaxScrollX(int i) {
        setMaxScrollX(this.f34416a, i);
    }

    @Deprecated
    public void setMaxScrollY(int i) {
        setMaxScrollY(this.f34416a, i);
    }

    @Deprecated
    public void setParcelableData(Parcelable parcelable) {
        this.f34416a.setParcelableData(parcelable);
    }

    @Deprecated
    public void setPassword(boolean z) {
        this.f34416a.setPassword(z);
    }

    @Deprecated
    public void setRemovedCount(int i) {
        this.f34416a.setRemovedCount(i);
    }

    @Deprecated
    public void setScrollX(int i) {
        this.f34416a.setScrollX(i);
    }

    @Deprecated
    public void setScrollY(int i) {
        this.f34416a.setScrollY(i);
    }

    @Deprecated
    public void setScrollable(boolean z) {
        this.f34416a.setScrollable(z);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public void setSource(View view) {
        this.f34416a.setSource(view);
    }

    @Deprecated
    public void setToIndex(int i) {
        this.f34416a.setToIndex(i);
    }

    public static int getMaxScrollX(@NonNull AccessibilityRecord accessibilityRecord) {
        return C4178a.m56565a(accessibilityRecord);
    }

    public static int getMaxScrollY(@NonNull AccessibilityRecord accessibilityRecord) {
        return C4178a.m56564b(accessibilityRecord);
    }

    @Deprecated
    public static AccessibilityRecordCompat obtain() {
        return new AccessibilityRecordCompat(AccessibilityRecord.obtain());
    }

    public static void setMaxScrollX(@NonNull AccessibilityRecord accessibilityRecord, int i) {
        C4178a.m56563c(accessibilityRecord, i);
    }

    public static void setMaxScrollY(@NonNull AccessibilityRecord accessibilityRecord, int i) {
        C4178a.m56562d(accessibilityRecord, i);
    }

    @Deprecated
    public void setSource(View view, int i) {
        setSource(this.f34416a, view, i);
    }

    public static void setSource(@NonNull AccessibilityRecord accessibilityRecord, @Nullable View view, int i) {
        C4179b.m56561a(accessibilityRecord, view, i);
    }
}