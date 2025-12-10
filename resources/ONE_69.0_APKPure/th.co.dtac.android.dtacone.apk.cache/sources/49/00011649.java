package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneNadOutboundInformationBinding */
/* loaded from: classes7.dex */
public final class FragmentOneNadOutboundInformationBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84088a;
    @NonNull
    public final CardView afterCallCardView;
    @NonNull
    public final OneFontTextView afterCallTitleTextView;
    @NonNull
    public final OneFontTextView afterCallValueTextView;
    @NonNull
    public final View afterCallView;
    @NonNull
    public final CardView billListCardView;
    @NonNull
    public final FrameLayout billListHeaderLayout;
    @NonNull
    public final CardView callDetailCardView;
    @NonNull
    public final ImageView callDetailImageView;
    @NonNull
    public final ConstraintLayout callDetailLayout;
    @NonNull
    public final ImageView callImageView;
    @NonNull
    public final ConstraintLayout callLayout;
    @NonNull
    public final OneFontTextView callTextView;
    @NonNull
    public final OneFontTextView channelForServiceTextView;
    @NonNull
    public final ImageView contactEmailImageView;
    @NonNull
    public final OneFontTextView contactEmailTextView;
    @NonNull
    public final OneFontTextView contactNameTextView;
    @NonNull
    public final OneFontTextView contactNumberTextView;
    @NonNull
    public final ImageView contactPaperImageView;
    @NonNull
    public final OneFontTextView contactPaperTextView;
    @NonNull
    public final ImageView contactSmsImageView;
    @NonNull
    public final CardView convergenceCardView;
    @NonNull
    public final FrameLayout convergenceCodeLayout;
    @NonNull
    public final OneFontTextView convergenceCodeTextView;
    @NonNull
    public final RecyclerView convergenceRecyclerView;
    @NonNull
    public final ConstraintLayout emailContactLayout;
    @NonNull
    public final NestedScrollView informationNestedScrollView;
    @NonNull
    public final RecyclerView invoiceRecyclerView;
    @NonNull
    public final OneFontTextView numberOfBillsTextView;
    @NonNull
    public final ConstraintLayout oneDeviceSaleSelectMaterialLayout;
    @NonNull
    public final ConstraintLayout paperLayout;
    @NonNull
    public final ConstraintLayout smsContactLayout;

    public FragmentOneNadOutboundInformationBinding(ConstraintLayout constraintLayout, CardView cardView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, View view, CardView cardView2, FrameLayout frameLayout, CardView cardView3, ImageView imageView, ConstraintLayout constraintLayout2, ImageView imageView2, ConstraintLayout constraintLayout3, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, ImageView imageView3, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, ImageView imageView4, OneFontTextView oneFontTextView8, ImageView imageView5, CardView cardView4, FrameLayout frameLayout2, OneFontTextView oneFontTextView9, RecyclerView recyclerView, ConstraintLayout constraintLayout4, NestedScrollView nestedScrollView, RecyclerView recyclerView2, OneFontTextView oneFontTextView10, ConstraintLayout constraintLayout5, ConstraintLayout constraintLayout6, ConstraintLayout constraintLayout7) {
        this.f84088a = constraintLayout;
        this.afterCallCardView = cardView;
        this.afterCallTitleTextView = oneFontTextView;
        this.afterCallValueTextView = oneFontTextView2;
        this.afterCallView = view;
        this.billListCardView = cardView2;
        this.billListHeaderLayout = frameLayout;
        this.callDetailCardView = cardView3;
        this.callDetailImageView = imageView;
        this.callDetailLayout = constraintLayout2;
        this.callImageView = imageView2;
        this.callLayout = constraintLayout3;
        this.callTextView = oneFontTextView3;
        this.channelForServiceTextView = oneFontTextView4;
        this.contactEmailImageView = imageView3;
        this.contactEmailTextView = oneFontTextView5;
        this.contactNameTextView = oneFontTextView6;
        this.contactNumberTextView = oneFontTextView7;
        this.contactPaperImageView = imageView4;
        this.contactPaperTextView = oneFontTextView8;
        this.contactSmsImageView = imageView5;
        this.convergenceCardView = cardView4;
        this.convergenceCodeLayout = frameLayout2;
        this.convergenceCodeTextView = oneFontTextView9;
        this.convergenceRecyclerView = recyclerView;
        this.emailContactLayout = constraintLayout4;
        this.informationNestedScrollView = nestedScrollView;
        this.invoiceRecyclerView = recyclerView2;
        this.numberOfBillsTextView = oneFontTextView10;
        this.oneDeviceSaleSelectMaterialLayout = constraintLayout5;
        this.paperLayout = constraintLayout6;
        this.smsContactLayout = constraintLayout7;
    }

    @NonNull
    public static FragmentOneNadOutboundInformationBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.afterCallCardView;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.afterCallTitleTextView;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.afterCallValueTextView;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.afterCallView))) != null) {
                    i = R.id.billListCardView;
                    CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
                    if (cardView2 != null) {
                        i = R.id.billListHeaderLayout;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout != null) {
                            i = R.id.callDetailCardView;
                            CardView cardView3 = (CardView) ViewBindings.findChildViewById(view, i);
                            if (cardView3 != null) {
                                i = R.id.callDetailImageView;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView != null) {
                                    i = R.id.callDetailLayout;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout != null) {
                                        i = R.id.callImageView;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView2 != null) {
                                            i = R.id.callLayout;
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                            if (constraintLayout2 != null) {
                                                i = R.id.callTextView;
                                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView3 != null) {
                                                    i = R.id.channelForServiceTextView;
                                                    OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView4 != null) {
                                                        i = R.id.contactEmailImageView;
                                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                        if (imageView3 != null) {
                                                            i = R.id.contactEmailTextView;
                                                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView5 != null) {
                                                                i = R.id.contactNameTextView;
                                                                OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView6 != null) {
                                                                    i = R.id.contactNumberTextView;
                                                                    OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView7 != null) {
                                                                        i = R.id.contactPaperImageView;
                                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                        if (imageView4 != null) {
                                                                            i = R.id.contactPaperTextView;
                                                                            OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (oneFontTextView8 != null) {
                                                                                i = R.id.contactSmsImageView;
                                                                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                if (imageView5 != null) {
                                                                                    i = R.id.convergenceCardView;
                                                                                    CardView cardView4 = (CardView) ViewBindings.findChildViewById(view, i);
                                                                                    if (cardView4 != null) {
                                                                                        i = R.id.convergenceCodeLayout;
                                                                                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                                                        if (frameLayout2 != null) {
                                                                                            i = R.id.convergenceCodeTextView;
                                                                                            OneFontTextView oneFontTextView9 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (oneFontTextView9 != null) {
                                                                                                i = R.id.convergenceRecyclerView;
                                                                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                                                if (recyclerView != null) {
                                                                                                    i = R.id.emailContactLayout;
                                                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                                    if (constraintLayout3 != null) {
                                                                                                        i = R.id.informationNestedScrollView;
                                                                                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (nestedScrollView != null) {
                                                                                                            i = R.id.invoiceRecyclerView;
                                                                                                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (recyclerView2 != null) {
                                                                                                                i = R.id.numberOfBillsTextView;
                                                                                                                OneFontTextView oneFontTextView10 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (oneFontTextView10 != null) {
                                                                                                                    i = R.id.oneDeviceSaleSelectMaterialLayout;
                                                                                                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (constraintLayout4 != null) {
                                                                                                                        i = R.id.paperLayout;
                                                                                                                        ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (constraintLayout5 != null) {
                                                                                                                            i = R.id.smsContactLayout;
                                                                                                                            ConstraintLayout constraintLayout6 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                            if (constraintLayout6 != null) {
                                                                                                                                return new FragmentOneNadOutboundInformationBinding((ConstraintLayout) view, cardView, oneFontTextView, oneFontTextView2, findChildViewById, cardView2, frameLayout, cardView3, imageView, constraintLayout, imageView2, constraintLayout2, oneFontTextView3, oneFontTextView4, imageView3, oneFontTextView5, oneFontTextView6, oneFontTextView7, imageView4, oneFontTextView8, imageView5, cardView4, frameLayout2, oneFontTextView9, recyclerView, constraintLayout3, nestedScrollView, recyclerView2, oneFontTextView10, constraintLayout4, constraintLayout5, constraintLayout6);
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
    public static FragmentOneNadOutboundInformationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneNadOutboundInformationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_nad_outbound_information, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84088a;
    }
}