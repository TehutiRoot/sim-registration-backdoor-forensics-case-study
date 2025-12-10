package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.loading.OneSwipeRefresh;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneHomeBinding */
/* loaded from: classes7.dex */
public final class FragmentOneHomeBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84051a;
    @NonNull
    public final FrameLayout backgroundMenu;
    @NonNull
    public final RelativeLayout btnCampaign;
    @NonNull
    public final RelativeLayout btnClose;
    @NonNull
    public final RelativeLayout btnCustEnquiry;
    @NonNull
    public final RelativeLayout btnMission;
    @NonNull
    public final RelativeLayout btnOption;
    @NonNull
    public final RelativeLayout btnPostValidation;
    @NonNull
    public final ConstraintLayout constraintLayout7;
    @NonNull
    public final ImageView ivBtnCampaign;
    @NonNull
    public final ImageView ivBtnClose;
    @NonNull
    public final ImageView ivBtnCustEnquiry;
    @NonNull
    public final ImageView ivBtnMission;
    @NonNull
    public final ImageView ivBtnOption;
    @NonNull
    public final ImageView ivBtnPostValidation;
    @NonNull
    public final LinearLayoutCompat layoutBalance;
    @NonNull
    public final ConstraintLayout layoutCampaignRedemption;
    @NonNull
    public final IncludeOneUserBalanceSectionBinding layoutCurrentBalanceSection;
    @NonNull
    public final LinearLayoutCompat layoutFloatingButton;
    @NonNull
    public final ConstraintLayout layoutMenu;
    @NonNull
    public final ConstraintLayout layoutMission;
    @NonNull
    public final IncludeOneUserProfileSectionBinding layoutProfileSection;
    @NonNull
    public final IncludeOneStaffBalanceSectionBinding layoutStaffBalanceSection;
    @NonNull
    public final OneFontTextView notiMessage;
    @NonNull
    public final OneFontTextView notiMessageMission;
    @NonNull
    public final RecyclerView recyclerGroupService;
    @NonNull
    public final Space space2;
    @NonNull
    public final Space spaceMission;
    @NonNull
    public final OneSwipeRefresh swipeContainer;
    @NonNull
    public final OneFontTextView textButton;
    @NonNull
    public final OneFontTextView textButtonMission;
    @NonNull
    public final OneFontTextView tvCampaignCountNotification;
    @NonNull
    public final OneFontTextView tvMissionCountNotification;
    @NonNull
    public final OneFontTextView tvOptionCountNotification;
    @NonNull
    public final View vGuildLineCenterBalance;

    public FragmentOneHomeBinding(LinearLayout linearLayout, FrameLayout frameLayout, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, RelativeLayout relativeLayout6, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, LinearLayoutCompat linearLayoutCompat, ConstraintLayout constraintLayout2, IncludeOneUserBalanceSectionBinding includeOneUserBalanceSectionBinding, LinearLayoutCompat linearLayoutCompat2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, IncludeOneUserProfileSectionBinding includeOneUserProfileSectionBinding, IncludeOneStaffBalanceSectionBinding includeOneStaffBalanceSectionBinding, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, RecyclerView recyclerView, Space space, Space space2, OneSwipeRefresh oneSwipeRefresh, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, View view) {
        this.f84051a = linearLayout;
        this.backgroundMenu = frameLayout;
        this.btnCampaign = relativeLayout;
        this.btnClose = relativeLayout2;
        this.btnCustEnquiry = relativeLayout3;
        this.btnMission = relativeLayout4;
        this.btnOption = relativeLayout5;
        this.btnPostValidation = relativeLayout6;
        this.constraintLayout7 = constraintLayout;
        this.ivBtnCampaign = imageView;
        this.ivBtnClose = imageView2;
        this.ivBtnCustEnquiry = imageView3;
        this.ivBtnMission = imageView4;
        this.ivBtnOption = imageView5;
        this.ivBtnPostValidation = imageView6;
        this.layoutBalance = linearLayoutCompat;
        this.layoutCampaignRedemption = constraintLayout2;
        this.layoutCurrentBalanceSection = includeOneUserBalanceSectionBinding;
        this.layoutFloatingButton = linearLayoutCompat2;
        this.layoutMenu = constraintLayout3;
        this.layoutMission = constraintLayout4;
        this.layoutProfileSection = includeOneUserProfileSectionBinding;
        this.layoutStaffBalanceSection = includeOneStaffBalanceSectionBinding;
        this.notiMessage = oneFontTextView;
        this.notiMessageMission = oneFontTextView2;
        this.recyclerGroupService = recyclerView;
        this.space2 = space;
        this.spaceMission = space2;
        this.swipeContainer = oneSwipeRefresh;
        this.textButton = oneFontTextView3;
        this.textButtonMission = oneFontTextView4;
        this.tvCampaignCountNotification = oneFontTextView5;
        this.tvMissionCountNotification = oneFontTextView6;
        this.tvOptionCountNotification = oneFontTextView7;
        this.vGuildLineCenterBalance = view;
    }

    @NonNull
    public static FragmentOneHomeBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        View findChildViewById3;
        int i = R.id.backgroundMenu;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.btnCampaign;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                i = R.id.btnClose;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout2 != null) {
                    i = R.id.btnCustEnquiry;
                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout3 != null) {
                        i = R.id.btnMission;
                        RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout4 != null) {
                            i = R.id.btnOption;
                            RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                            if (relativeLayout5 != null) {
                                i = R.id.btnPostValidation;
                                RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                if (relativeLayout6 != null) {
                                    i = R.id.constraintLayout7;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout != null) {
                                        i = R.id.ivBtnCampaign;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView != null) {
                                            i = R.id.ivBtnClose;
                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView2 != null) {
                                                i = R.id.ivBtnCustEnquiry;
                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView3 != null) {
                                                    i = R.id.ivBtnMission;
                                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                    if (imageView4 != null) {
                                                        i = R.id.ivBtnOption;
                                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                        if (imageView5 != null) {
                                                            i = R.id.ivBtnPostValidation;
                                                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                            if (imageView6 != null) {
                                                                i = R.id.layoutBalance;
                                                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                if (linearLayoutCompat != null) {
                                                                    i = R.id.layoutCampaignRedemption;
                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (constraintLayout2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.layoutCurrentBalanceSection))) != null) {
                                                                        IncludeOneUserBalanceSectionBinding bind = IncludeOneUserBalanceSectionBinding.bind(findChildViewById);
                                                                        i = R.id.layoutFloatingButton;
                                                                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                        if (linearLayoutCompat2 != null) {
                                                                            i = R.id.layoutMenu;
                                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                            if (constraintLayout3 != null) {
                                                                                i = R.id.layoutMission;
                                                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                if (constraintLayout4 != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.layoutProfileSection))) != null) {
                                                                                    IncludeOneUserProfileSectionBinding bind2 = IncludeOneUserProfileSectionBinding.bind(findChildViewById2);
                                                                                    i = R.id.layoutStaffBalanceSection;
                                                                                    View findChildViewById4 = ViewBindings.findChildViewById(view, i);
                                                                                    if (findChildViewById4 != null) {
                                                                                        IncludeOneStaffBalanceSectionBinding bind3 = IncludeOneStaffBalanceSectionBinding.bind(findChildViewById4);
                                                                                        i = R.id.notiMessage;
                                                                                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (oneFontTextView != null) {
                                                                                            i = R.id.notiMessageMission;
                                                                                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (oneFontTextView2 != null) {
                                                                                                i = R.id.recyclerGroupService;
                                                                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                                                if (recyclerView != null) {
                                                                                                    i = R.id.space2;
                                                                                                    Space space = (Space) ViewBindings.findChildViewById(view, i);
                                                                                                    if (space != null) {
                                                                                                        i = R.id.spaceMission;
                                                                                                        Space space2 = (Space) ViewBindings.findChildViewById(view, i);
                                                                                                        if (space2 != null) {
                                                                                                            i = R.id.swipeContainer;
                                                                                                            OneSwipeRefresh oneSwipeRefresh = (OneSwipeRefresh) ViewBindings.findChildViewById(view, i);
                                                                                                            if (oneSwipeRefresh != null) {
                                                                                                                i = R.id.textButton;
                                                                                                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (oneFontTextView3 != null) {
                                                                                                                    i = R.id.textButtonMission;
                                                                                                                    OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (oneFontTextView4 != null) {
                                                                                                                        i = R.id.tvCampaignCountNotification;
                                                                                                                        OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (oneFontTextView5 != null) {
                                                                                                                            i = R.id.tvMissionCountNotification;
                                                                                                                            OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                            if (oneFontTextView6 != null) {
                                                                                                                                i = R.id.tvOptionCountNotification;
                                                                                                                                OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                if (oneFontTextView7 != null && (findChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.vGuildLineCenterBalance))) != null) {
                                                                                                                                    return new FragmentOneHomeBinding((LinearLayout) view, frameLayout, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, relativeLayout6, constraintLayout, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, linearLayoutCompat, constraintLayout2, bind, linearLayoutCompat2, constraintLayout3, constraintLayout4, bind2, bind3, oneFontTextView, oneFontTextView2, recyclerView, space, space2, oneSwipeRefresh, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, findChildViewById3);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneHomeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneHomeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_home, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84051a;
    }
}