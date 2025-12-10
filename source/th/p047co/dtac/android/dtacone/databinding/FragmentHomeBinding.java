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
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentHomeBinding */
/* loaded from: classes7.dex */
public final class FragmentHomeBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83753a;
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
    public final ConstraintLayout layoutCampaignRedemption;
    @NonNull
    public final IncludeUserBalanceSectionBinding layoutCurrentBalanceSection;
    @NonNull
    public final LinearLayoutCompat layoutFloatingButton;
    @NonNull
    public final ConstraintLayout layoutMenu;
    @NonNull
    public final ConstraintLayout layoutMission;
    @NonNull
    public final IncludeUserProfileSectionBinding layoutProfileSection;
    @NonNull
    public final IncludeStaffBalanceSectionBinding layoutStaffBalanceSection;
    @NonNull
    public final DtacFontTextView notiMessage;
    @NonNull
    public final DtacFontTextView notiMessageMission;
    @NonNull
    public final RecyclerView recyclerGroupService;
    @NonNull
    public final CardView rootLayout;
    @NonNull
    public final Space space2;
    @NonNull
    public final Space spaceMission;
    @NonNull
    public final DtacSwipeRefresh swipeContainer;
    @NonNull
    public final DtacFontTextView textButton;
    @NonNull
    public final DtacFontTextView textButtonMission;
    @NonNull
    public final DtacFontTextView tvCampaignCountNotification;
    @NonNull
    public final DtacFontTextView tvMissionCountNotification;
    @NonNull
    public final DtacFontTextView tvOptionCountNotification;

    public FragmentHomeBinding(LinearLayout linearLayout, FrameLayout frameLayout, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, RelativeLayout relativeLayout6, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ConstraintLayout constraintLayout2, IncludeUserBalanceSectionBinding includeUserBalanceSectionBinding, LinearLayoutCompat linearLayoutCompat, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, IncludeUserProfileSectionBinding includeUserProfileSectionBinding, IncludeStaffBalanceSectionBinding includeStaffBalanceSectionBinding, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, RecyclerView recyclerView, CardView cardView, Space space, Space space2, DtacSwipeRefresh dtacSwipeRefresh, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7) {
        this.f83753a = linearLayout;
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
        this.layoutCampaignRedemption = constraintLayout2;
        this.layoutCurrentBalanceSection = includeUserBalanceSectionBinding;
        this.layoutFloatingButton = linearLayoutCompat;
        this.layoutMenu = constraintLayout3;
        this.layoutMission = constraintLayout4;
        this.layoutProfileSection = includeUserProfileSectionBinding;
        this.layoutStaffBalanceSection = includeStaffBalanceSectionBinding;
        this.notiMessage = dtacFontTextView;
        this.notiMessageMission = dtacFontTextView2;
        this.recyclerGroupService = recyclerView;
        this.rootLayout = cardView;
        this.space2 = space;
        this.spaceMission = space2;
        this.swipeContainer = dtacSwipeRefresh;
        this.textButton = dtacFontTextView3;
        this.textButtonMission = dtacFontTextView4;
        this.tvCampaignCountNotification = dtacFontTextView5;
        this.tvMissionCountNotification = dtacFontTextView6;
        this.tvOptionCountNotification = dtacFontTextView7;
    }

    @NonNull
    public static FragmentHomeBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
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
                                                                i = R.id.layoutCampaignRedemption;
                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                if (constraintLayout2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.layoutCurrentBalanceSection))) != null) {
                                                                    IncludeUserBalanceSectionBinding bind = IncludeUserBalanceSectionBinding.bind(findChildViewById);
                                                                    i = R.id.layoutFloatingButton;
                                                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                    if (linearLayoutCompat != null) {
                                                                        i = R.id.layoutMenu;
                                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                        if (constraintLayout3 != null) {
                                                                            i = R.id.layoutMission;
                                                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                            if (constraintLayout4 != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.layoutProfileSection))) != null) {
                                                                                IncludeUserProfileSectionBinding bind2 = IncludeUserProfileSectionBinding.bind(findChildViewById2);
                                                                                i = R.id.layoutStaffBalanceSection;
                                                                                View findChildViewById3 = ViewBindings.findChildViewById(view, i);
                                                                                if (findChildViewById3 != null) {
                                                                                    IncludeStaffBalanceSectionBinding bind3 = IncludeStaffBalanceSectionBinding.bind(findChildViewById3);
                                                                                    i = R.id.notiMessage;
                                                                                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (dtacFontTextView != null) {
                                                                                        i = R.id.notiMessageMission;
                                                                                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (dtacFontTextView2 != null) {
                                                                                            i = R.id.recyclerGroupService;
                                                                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                                            if (recyclerView != null) {
                                                                                                i = R.id.rootLayout;
                                                                                                CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                                                                                                if (cardView != null) {
                                                                                                    i = R.id.space2;
                                                                                                    Space space = (Space) ViewBindings.findChildViewById(view, i);
                                                                                                    if (space != null) {
                                                                                                        i = R.id.spaceMission;
                                                                                                        Space space2 = (Space) ViewBindings.findChildViewById(view, i);
                                                                                                        if (space2 != null) {
                                                                                                            i = R.id.swipeContainer;
                                                                                                            DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) ViewBindings.findChildViewById(view, i);
                                                                                                            if (dtacSwipeRefresh != null) {
                                                                                                                i = R.id.textButton;
                                                                                                                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (dtacFontTextView3 != null) {
                                                                                                                    i = R.id.textButtonMission;
                                                                                                                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (dtacFontTextView4 != null) {
                                                                                                                        i = R.id.tvCampaignCountNotification;
                                                                                                                        DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (dtacFontTextView5 != null) {
                                                                                                                            i = R.id.tvMissionCountNotification;
                                                                                                                            DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                            if (dtacFontTextView6 != null) {
                                                                                                                                i = R.id.tvOptionCountNotification;
                                                                                                                                DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                if (dtacFontTextView7 != null) {
                                                                                                                                    return new FragmentHomeBinding((LinearLayout) view, frameLayout, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, relativeLayout6, constraintLayout, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, constraintLayout2, bind, linearLayoutCompat, constraintLayout3, constraintLayout4, bind2, bind3, dtacFontTextView, dtacFontTextView2, recyclerView, cardView, space, space2, dtacSwipeRefresh, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7);
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
    public static FragmentHomeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentHomeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_home, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83753a;
    }
}
