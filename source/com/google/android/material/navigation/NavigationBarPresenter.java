package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.ParcelableSparseArray;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class NavigationBarPresenter implements MenuPresenter {

    /* renamed from: a */
    public MenuBuilder f50385a;

    /* renamed from: b */
    public NavigationBarMenuView f50386b;

    /* renamed from: c */
    public boolean f50387c = false;

    /* renamed from: d */
    public int f50388d;

    /* renamed from: com.google.android.material.navigation.NavigationBarPresenter$a */
    /* loaded from: classes4.dex */
    public static class C7014a implements Parcelable {
        public static final Parcelable.Creator<C7014a> CREATOR = new C7015a();

        /* renamed from: a */
        public int f50389a;

        /* renamed from: b */
        public ParcelableSparseArray f50390b;

        /* renamed from: com.google.android.material.navigation.NavigationBarPresenter$a$a */
        /* loaded from: classes4.dex */
        public class C7015a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C7014a createFromParcel(Parcel parcel) {
                return new C7014a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C7014a[] newArray(int i) {
                return new C7014a[i];
            }
        }

        public C7014a() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f50389a);
            parcel.writeParcelable(this.f50390b, 0);
        }

        public C7014a(Parcel parcel) {
            this.f50389a = parcel.readInt();
            this.f50390b = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(@Nullable MenuBuilder menuBuilder, @Nullable MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean expandItemActionView(@Nullable MenuBuilder menuBuilder, @Nullable MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.f50388d;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    @Nullable
    public MenuView getMenuView(@Nullable ViewGroup viewGroup) {
        return this.f50386b;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(@NonNull Context context, @NonNull MenuBuilder menuBuilder) {
        this.f50385a = menuBuilder;
        this.f50386b.initialize(menuBuilder);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(@Nullable MenuBuilder menuBuilder, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(@NonNull Parcelable parcelable) {
        if (parcelable instanceof C7014a) {
            C7014a c7014a = (C7014a) parcelable;
            this.f50386b.m44485i(c7014a.f50389a);
            this.f50386b.m44486h(BadgeUtils.createBadgeDrawablesFromSavedStates(this.f50386b.getContext(), c7014a.f50390b));
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    @NonNull
    public Parcelable onSaveInstanceState() {
        C7014a c7014a = new C7014a();
        c7014a.f50389a = this.f50386b.getSelectedItemId();
        c7014a.f50390b = BadgeUtils.createParcelableBadgeStates(this.f50386b.getBadgeDrawables());
        return c7014a;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(@Nullable SubMenuBuilder subMenuBuilder) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(@Nullable MenuPresenter.Callback callback) {
    }

    public void setId(int i) {
        this.f50388d = i;
    }

    public void setMenuView(@NonNull NavigationBarMenuView navigationBarMenuView) {
        this.f50386b = navigationBarMenuView;
    }

    public void setUpdateSuspended(boolean z) {
        this.f50387c = z;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z) {
        if (this.f50387c) {
            return;
        }
        if (z) {
            this.f50386b.buildMenuView();
        } else {
            this.f50386b.updateMenuView();
        }
    }
}
