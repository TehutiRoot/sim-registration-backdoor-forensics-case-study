package th.p047co.dtac.android.dtacone.adapter.update_prepaid;

import android.app.Application;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zxy.tiny.Tiny;
import com.zxy.tiny.callback.BitmapCallback;
import java.io.File;
import java.util.List;
import javax.inject.Inject;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.update_prepaid.PhotoListAdapter;
import th.p047co.dtac.android.dtacone.adapter.update_prepaid.view_holder.AddMorePhotoViewHolder;
import th.p047co.dtac.android.dtacone.adapter.update_prepaid.view_holder.PhotoViewHolder;
import th.p047co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidPhotoList;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

/* renamed from: th.co.dtac.android.dtacone.adapter.update_prepaid.PhotoListAdapter */
/* loaded from: classes7.dex */
public class PhotoListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public List f81556a;

    /* renamed from: b */
    public PhotoListOnClick f81557b;

    /* renamed from: c */
    public Application f81558c;

    /* renamed from: d */
    public BitmapUtil f81559d;

    @Inject
    public PhotoListAdapter(Application application, BitmapUtil bitmapUtil) {
        this.f81558c = application;
        this.f81559d = bitmapUtil;
    }

    /* renamed from: a */
    public static /* synthetic */ void m20206a(PhotoViewHolder photoViewHolder, boolean z, Bitmap bitmap, Throwable th2) {
        m20196k(photoViewHolder, z, bitmap, th2);
    }

    /* renamed from: b */
    public static /* synthetic */ void m20205b(PhotoListAdapter photoListAdapter, String str, View view) {
        photoListAdapter.m20195l(str, view);
    }

    /* renamed from: c */
    public static /* synthetic */ void m20204c(PhotoListAdapter photoListAdapter, String str, int i, View view) {
        photoListAdapter.m20194m(str, i, view);
    }

    /* renamed from: d */
    public static /* synthetic */ void m20203d(PhotoListAdapter photoListAdapter, int i, View view) {
        photoListAdapter.m20197j(i, view);
    }

    /* renamed from: k */
    public static /* synthetic */ void m20196k(PhotoViewHolder photoViewHolder, boolean z, Bitmap bitmap, Throwable th2) {
        photoViewHolder.ivPhoto.setImage(bitmap);
    }

    /* renamed from: e */
    public final RecyclerView.ViewHolder m20202e(ViewGroup viewGroup) {
        return new AddMorePhotoViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.z_add_photo_item_list, viewGroup, false));
    }

    /* renamed from: f */
    public final RecyclerView.ViewHolder m20201f(ViewGroup viewGroup) {
        return new PhotoViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.z_photo_item_list, viewGroup, false));
    }

    /* renamed from: g */
    public final RecyclerView.ViewHolder m20200g(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return m20202e(viewGroup);
        }
        return m20201f(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f81556a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return !m20199h(i);
    }

    /* renamed from: h */
    public final boolean m20199h(int i) {
        return !new File(this.f81558c.getFilesDir(), String.format("%s.jpg", ((UpdatePrepaidPhotoList) this.f81556a.get(i)).getCardType())).exists();
    }

    /* renamed from: i */
    public final boolean m20198i(RecyclerView.ViewHolder viewHolder) {
        return viewHolder instanceof AddMorePhotoViewHolder;
    }

    /* renamed from: j */
    public final /* synthetic */ void m20197j(int i, View view) {
        this.f81557b.onClickOpenCamera(((UpdatePrepaidPhotoList) this.f81556a.get(i)).getCardType(), i);
    }

    /* renamed from: l */
    public final /* synthetic */ void m20195l(String str, View view) {
        this.f81557b.onClickPreviewPhoto(str);
    }

    /* renamed from: m */
    public final /* synthetic */ void m20194m(String str, int i, View view) {
        this.f81557b.onClickDeleteImage(str, i);
    }

    /* renamed from: n */
    public final void m20193n(AddMorePhotoViewHolder addMorePhotoViewHolder, final int i) {
        addMorePhotoViewHolder.tvIdCardLabel.setText(((UpdatePrepaidPhotoList) this.f81556a.get(i)).getCardType());
        addMorePhotoViewHolder.cameraBox.setOnClickListener(new View.OnClickListener() { // from class: mk1
            {
                PhotoListAdapter.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoListAdapter.m20203d(PhotoListAdapter.this, i, view);
            }
        });
    }

    /* renamed from: o */
    public final void m20192o(final PhotoViewHolder photoViewHolder, final int i) {
        String cardType = ((UpdatePrepaidPhotoList) this.f81556a.get(i)).getCardType();
        final String format = String.format("%s.jpg", cardType);
        Tiny.getInstance().source(this.f81559d.loadInternalBitmap(format)).asBitmap().compress(new BitmapCallback() { // from class: nk1
            @Override // com.zxy.tiny.callback.BitmapCallback
            public final void callback(boolean z, Bitmap bitmap, Throwable th2) {
                PhotoListAdapter.m20206a(PhotoViewHolder.this, z, bitmap, th2);
            }
        });
        photoViewHolder.ivPhoto.setOnClickListener(new View.OnClickListener() { // from class: ok1
            {
                PhotoListAdapter.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoListAdapter.m20205b(PhotoListAdapter.this, format, view);
            }
        });
        photoViewHolder.tvCardType.setText(cardType);
        photoViewHolder.ivCancel.setOnClickListener(new View.OnClickListener() { // from class: pk1
            {
                PhotoListAdapter.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoListAdapter.m20204c(PhotoListAdapter.this, format, i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (m20198i(viewHolder)) {
            m20193n((AddMorePhotoViewHolder) viewHolder, i);
        } else {
            m20192o((PhotoViewHolder) viewHolder, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m20200g(viewGroup, i);
    }

    public void setPhotoList(List<UpdatePrepaidPhotoList> list, PhotoListOnClick photoListOnClick) {
        this.f81556a = list;
        this.f81557b = photoListOnClick;
    }
}
