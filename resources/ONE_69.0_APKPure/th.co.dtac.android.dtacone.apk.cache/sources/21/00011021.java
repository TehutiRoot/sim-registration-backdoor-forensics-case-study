package th.p047co.dtac.android.dtacone.adapter.take_photo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.take_photo.PhotoListAdapter;
import th.p047co.dtac.android.dtacone.databinding.PhotoListItemBinding;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.take_photo.PhotoItem;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b%\u0010&¨\u0006("}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/take_photo/PhotoListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lth/co/dtac/android/dtacone/adapter/take_photo/PhotoListAdapter$PhotoViewHolder;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lth/co/dtac/android/dtacone/model/take_photo/PhotoItem;", "photoListItems", "Lkotlin/Function1;", "", "", "scrollToPosition", "onClick", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lth/co/dtac/android/dtacone/adapter/take_photo/PhotoListAdapter$PhotoViewHolder;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Lth/co/dtac/android/dtacone/adapter/take_photo/PhotoListAdapter$PhotoViewHolder;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", OperatorName.CURVE_TO, "Lkotlin/jvm/functions/Function1;", "d", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "PhotoViewHolder", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.adapter.take_photo.PhotoListAdapter */
/* loaded from: classes7.dex */
public final class PhotoListAdapter extends RecyclerView.Adapter<PhotoViewHolder> {
    public static final int $stable = 8;

    /* renamed from: a */
    public Context f81642a;

    /* renamed from: b */
    public List f81643b;

    /* renamed from: c */
    public final Function1 f81644c;

    /* renamed from: d */
    public final Function1 f81645d;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m29142d2 = {"Lth/co/dtac/android/dtacone/adapter/take_photo/PhotoListAdapter$PhotoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lth/co/dtac/android/dtacone/databinding/PhotoListItemBinding;", "binding", "<init>", "(Lth/co/dtac/android/dtacone/databinding/PhotoListItemBinding;)V", "Lth/co/dtac/android/dtacone/model/take_photo/PhotoItem;", "item", "", "position", "Lkotlin/Function1;", "", "scrollToPosition", "onClick", "bind", "(Lth/co/dtac/android/dtacone/model/take_photo/PhotoItem;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/PhotoListItemBinding;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.adapter.take_photo.PhotoListAdapter$PhotoViewHolder */
    /* loaded from: classes7.dex */
    public static final class PhotoViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final PhotoListItemBinding f81646a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PhotoViewHolder(@NotNull PhotoListItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f81646a = binding;
        }

        /* renamed from: b */
        public static /* synthetic */ void m20383b(PhotoItem photoItem, Function1 function1, PhotoViewHolder photoViewHolder, View view) {
            m20382c(photoItem, function1, photoViewHolder, view);
        }

        /* renamed from: c */
        public static final void m20382c(PhotoItem item, Function1 onClick, PhotoViewHolder this$0, View view) {
            Intrinsics.checkNotNullParameter(item, "$item");
            Intrinsics.checkNotNullParameter(onClick, "$onClick");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (item.isActive()) {
                return;
            }
            onClick.invoke(Integer.valueOf(this$0.getAdapterPosition()));
        }

        public final void bind(@NotNull final PhotoItem item, int i, @NotNull Function1<? super Integer, Unit> scrollToPosition, @NotNull final Function1<? super Integer, Unit> onClick) {
            int i2;
            boolean z;
            int i3;
            boolean z2 = true;
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(scrollToPosition, "scrollToPosition");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            this.f81646a.textViewLabel.setText(item.getTitle());
            ImageView imageView = this.f81646a.dotRequire;
            if (item.isRequired()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            ImageView imageView2 = this.f81646a.imageViewPhoto;
            if (item.getSrc() != null) {
                if (Intrinsics.areEqual(item.getFrameType(), OptionalModuleUtils.FACE)) {
                    Glide.with(imageView2).m74223load(item.getSrc()).apply((BaseRequestOptions<?>) new RequestOptions().transforms(new CenterCrop(), new RoundedCorners(12)).autoClone()).into(imageView2);
                } else {
                    Glide.with(imageView2).m74223load(item.getSrc()).into(imageView2);
                }
                imageView2.setVisibility(0);
            } else {
                imageView2.setImageBitmap(null);
                imageView2.setVisibility(8);
            }
            FrameLayout frameLayout = this.f81646a.framePhoto;
            if (item.getSrc() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z & (!item.isActive())) {
                i3 = R.drawable.bg_photo_no_border;
            } else {
                if (item.getSrc() == null) {
                    z2 = false;
                }
                if (z2 & item.isActive()) {
                    i3 = R.drawable.bg_photo_dash_border;
                } else if (item.isActive()) {
                    i3 = R.drawable.border_dash_stroke_blue;
                } else {
                    i3 = R.drawable.border_dash_stroke_grey;
                }
            }
            frameLayout.setBackgroundResource(i3);
            ImageView view = this.f81646a.imageCamera;
            Intrinsics.checkNotNullExpressionValue(view, "view");
            ViewVisibleExtKt.toVisible(view);
            if (item.getSrc() != null) {
                ViewVisibleExtKt.toGone(view);
            } else if (item.isActive()) {
                view.setImageResource(R.mipmap.icon_camera_box_active);
            } else {
                view.setImageResource(R.mipmap.icon_camera_box_inactive);
            }
            DtacFontTextView dtacFontTextView = this.f81646a.textViewLabel;
            if (item.isActive()) {
                dtacFontTextView.setTextColor(ContextCompat.getColor(this.itemView.getContext(), R.color.dtacBlue));
            } else {
                dtacFontTextView.setTextColor(ContextCompat.getColor(this.itemView.getContext(), R.color.grayishBrown48));
            }
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: nl1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PhotoListAdapter.PhotoViewHolder.m20383b(PhotoItem.this, onClick, this, view2);
                }
            });
        }
    }

    public /* synthetic */ PhotoListAdapter(Context context, List list, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : list, function1, function12);
    }

    @NotNull
    public final Context getContext() {
        return this.f81642a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81643b.size();
    }

    @NotNull
    public final Function1<Integer, Unit> getOnClick() {
        return this.f81645d;
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.f81642a = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull PhotoViewHolder holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind((PhotoItem) this.f81643b.get(i), i, this.f81644c, new PhotoListAdapter$onBindViewHolder$1(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public PhotoViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        PhotoListItemBinding inflate = PhotoListItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f….context), parent, false)");
        return new PhotoViewHolder(inflate);
    }

    public PhotoListAdapter(@NotNull Context context, @NotNull List<PhotoItem> photoListItems, @NotNull Function1<? super Integer, Unit> scrollToPosition, @NotNull Function1<? super Integer, Unit> onClick) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(photoListItems, "photoListItems");
        Intrinsics.checkNotNullParameter(scrollToPosition, "scrollToPosition");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f81642a = context;
        this.f81643b = photoListItems;
        this.f81644c = scrollToPosition;
        this.f81645d = onClick;
    }
}