package th.p047co.dtac.android.dtacone.adapter.postpaid_package;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.postpaid_package.PostpaidPackageSetAdapter;
import th.p047co.dtac.android.dtacone.databinding.ZPostpaidPackageItemRowBinding;
import th.p047co.dtac.android.dtacone.databinding.ZPostpaidPackageSetGroupBinding;
import th.p047co.dtac.android.dtacone.model.postpaid.PackageSet;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;

/* renamed from: th.co.dtac.android.dtacone.adapter.postpaid_package.PostpaidPackageSetAdapter */
/* loaded from: classes7.dex */
public class PostpaidPackageSetAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public List f81485a;

    /* renamed from: b */
    public final int f81486b = 1;

    /* renamed from: c */
    public final int f81487c = 2;

    /* renamed from: d */
    public Context f81488d;

    /* renamed from: e */
    public OnClickPackage f81489e;

    /* renamed from: th.co.dtac.android.dtacone.adapter.postpaid_package.PostpaidPackageSetAdapter$OnClickPackage */
    /* loaded from: classes7.dex */
    public interface OnClickPackage {
        void onClickPackageItem(PackageSet packageSet);
    }

    public PostpaidPackageSetAdapter(Context context) {
        this.f81488d = context;
    }

    /* renamed from: a */
    public static /* synthetic */ void m20459a(PostpaidPackageSetAdapter postpaidPackageSetAdapter, PackageSet packageSet, View view) {
        postpaidPackageSetAdapter.m20458b(packageSet, view);
    }

    /* renamed from: b */
    public final /* synthetic */ void m20458b(PackageSet packageSet, View view) {
        this.f81489e.onClickPackageItem(packageSet);
    }

    /* renamed from: c */
    public final void m20457c(PackageViewHolder packageViewHolder, PackageSet packageSet) {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        packageViewHolder.getTvPackageName().setText(packageSet.getPackageName());
        packageViewHolder.getTvPrice().setText(String.format("%s.-", packageSet.getMarketPrice()));
        packageViewHolder.getTvVoice().setText(packageSet.getVoice());
        packageViewHolder.getTvVoiceUnit().setText(packageSet.getVoiceUnit());
        LinearLayout voiceBox = packageViewHolder.getVoiceBox();
        int i5 = 8;
        if (StringUtil.hasText(packageSet.getVoice())) {
            i = 0;
        } else {
            i = 8;
        }
        voiceBox.setVisibility(i);
        packageViewHolder.getTvWifi().setText(packageSet.getWifi());
        packageViewHolder.getTvWifiUnit().setText(packageSet.getWifiUnit());
        LinearLayout wifiBox = packageViewHolder.getWifiBox();
        if (StringUtil.hasText(packageSet.getWifi())) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        wifiBox.setVisibility(i2);
        packageViewHolder.getTvData().setText(packageSet.getData());
        packageViewHolder.getTvDataUnit().setText(packageSet.getDataUnit());
        LinearLayout callBox = packageViewHolder.getCallBox();
        if (StringUtil.hasText(packageSet.getData())) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        callBox.setVisibility(i3);
        packageViewHolder.getTvStorage().setText(packageSet.getStorage());
        packageViewHolder.getTvStorageUnit().setText(packageSet.getStorageUnit());
        LinearLayout storeBox = packageViewHolder.getStoreBox();
        if (StringUtil.hasText(packageSet.getStorage())) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        storeBox.setVisibility(i4);
        packageViewHolder.getTvBillCycle().setText(packageSet.getBillCycle());
        packageViewHolder.getTvBillCycleUnit().setText(packageSet.getBillCycleUnit());
        LinearLayout billBox = packageViewHolder.getBillBox();
        if (StringUtil.hasText(packageSet.getBillCycle())) {
            i5 = 0;
        }
        billBox.setVisibility(i5);
        List<String> packageDescription = packageSet.getPackageDescription();
        String str2 = "";
        for (int i6 = 0; i6 < packageDescription.size(); i6++) {
            if (StringUtil.hasText(packageDescription.get(i6))) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                String string = this.f81488d.getString(R.string.dot);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(packageDescription.get(i6));
                if (packageDescription.size() == i6 + 1) {
                    str = "";
                } else {
                    str = "\n";
                }
                sb2.append(str);
                sb.append(String.format("%s   %s", string, sb2.toString()));
                str2 = sb.toString();
            }
        }
        packageViewHolder.getTvDescription().setText(str2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List list = this.f81485a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f81485a.get(i) instanceof String) {
            return 1;
        }
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Object obj = this.f81485a.get(i);
        if (viewHolder instanceof PostpaidPackageGroupViewHolder) {
            ((PostpaidPackageGroupViewHolder) viewHolder).getTvGroup().setText(obj.toString());
            return;
        }
        PackageViewHolder packageViewHolder = (PackageViewHolder) viewHolder;
        final PackageSet packageSet = (PackageSet) obj;
        m20457c(packageViewHolder, packageSet);
        if (this.f81489e != null) {
            packageViewHolder.getRelativeLayoutPackageBox().setOnClickListener(new View.OnClickListener() { // from class: pm1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PostpaidPackageSetAdapter.m20459a(PostpaidPackageSetAdapter.this, packageSet, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new PostpaidPackageGroupViewHolder(ZPostpaidPackageSetGroupBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        }
        return new PackageViewHolder(ZPostpaidPackageItemRowBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }

    public void setListener(OnClickPackage onClickPackage) {
        this.f81489e = onClickPackage;
    }

    public void setPackageList(List<Object> list) {
        this.f81485a = list;
    }
}