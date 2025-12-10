package com.bumptech.glide.manager;

import android.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.RequestManager;
import java.util.Collections;
import java.util.Set;

@Deprecated
/* loaded from: classes3.dex */
public class RequestManagerFragment extends Fragment {

    /* renamed from: com.bumptech.glide.manager.RequestManagerFragment$a */
    /* loaded from: classes3.dex */
    public class C5897a implements RequestManagerTreeNode {
        public C5897a() {
        }

        @Override // com.bumptech.glide.manager.RequestManagerTreeNode
        public Set getDescendants() {
            return Collections.emptySet();
        }
    }

    @Nullable
    @Deprecated
    public RequestManager getRequestManager() {
        return null;
    }

    @NonNull
    @Deprecated
    public RequestManagerTreeNode getRequestManagerTreeNode() {
        return new C5897a();
    }

    @Deprecated
    public void setRequestManager(@Nullable RequestManager requestManager) {
    }
}
