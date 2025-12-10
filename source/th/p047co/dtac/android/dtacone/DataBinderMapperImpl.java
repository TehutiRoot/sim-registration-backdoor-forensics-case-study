package th.p047co.dtac.android.dtacone;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: th.co.dtac.android.dtacone.DataBinderMapperImpl */
/* loaded from: classes7.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a */
    public static final SparseIntArray f80914a = new SparseIntArray(0);

    /* renamed from: th.co.dtac.android.dtacone.DataBinderMapperImpl$a */
    /* loaded from: classes7.dex */
    public static class C14123a {

        /* renamed from: a */
        public static final SparseArray f80915a;

        static {
            SparseArray sparseArray = new SparseArray(1);
            f80915a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.DataBinderMapperImpl$b */
    /* loaded from: classes7.dex */
    public static class C14124b {

        /* renamed from: a */
        public static final HashMap f80916a = new HashMap(0);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.github.gcacace.signaturepad.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return (String) C14123a.f80915a.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        if (f80914a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = (Integer) C14124b.f80916a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f80914a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
