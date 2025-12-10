package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.R;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import ch.qos.logback.core.joran.action.Action;

/* renamed from: androidx.fragment.app.e */
/* loaded from: classes2.dex */
public class LayoutInflater$Factory2C4605e implements LayoutInflater.Factory2 {

    /* renamed from: a */
    public final FragmentManager f35736a;

    /* renamed from: androidx.fragment.app.e$a */
    /* loaded from: classes2.dex */
    public class View$OnAttachStateChangeListenerC4606a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C4615j f35737a;

        public View$OnAttachStateChangeListenerC4606a(C4615j c4615j) {
            this.f35737a = c4615j;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment m54165k = this.f35737a.m54165k();
            this.f35737a.m54163m();
            SpecialEffectsController.getOrCreateController((ViewGroup) m54165k.mView.getParent(), LayoutInflater$Factory2C4605e.this.f35736a).forceCompleteAllOperations();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public LayoutInflater$Factory2C4605e(FragmentManager fragmentManager) {
        this.f35736a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C4615j m54284v;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f35736a);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, Action.CLASS_ATTRIBUTE);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Fragment);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(R.styleable.Fragment_android_name);
            }
            int resourceId = obtainStyledAttributes.getResourceId(R.styleable.Fragment_android_id, -1);
            String string = obtainStyledAttributes.getString(R.styleable.Fragment_android_tag);
            obtainStyledAttributes.recycle();
            if (attributeValue == null || !FragmentFactory.m54401a(context.getClassLoader(), attributeValue)) {
                return null;
            }
            int id2 = view != null ? view.getId() : 0;
            if (id2 == -1 && resourceId == -1 && string == null) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
            }
            Fragment findFragmentById = resourceId != -1 ? this.f35736a.findFragmentById(resourceId) : null;
            if (findFragmentById == null && string != null) {
                findFragmentById = this.f35736a.findFragmentByTag(string);
            }
            if (findFragmentById == null && id2 != -1) {
                findFragmentById = this.f35736a.findFragmentById(id2);
            }
            if (findFragmentById == null) {
                findFragmentById = this.f35736a.getFragmentFactory().instantiate(context.getClassLoader(), attributeValue);
                findFragmentById.mFromLayout = true;
                findFragmentById.mFragmentId = resourceId != 0 ? resourceId : id2;
                findFragmentById.mContainerId = id2;
                findFragmentById.mTag = string;
                findFragmentById.mInLayout = true;
                FragmentManager fragmentManager = this.f35736a;
                findFragmentById.mFragmentManager = fragmentManager;
                findFragmentById.mHost = fragmentManager.getHost();
                findFragmentById.onInflate(this.f35736a.getHost().m54398b(), attributeSet, findFragmentById.mSavedFragmentState);
                m54284v = this.f35736a.m54316j(findFragmentById);
                if (FragmentManager.isLoggingEnabled(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Fragment ");
                    sb.append(findFragmentById);
                    sb.append(" has been inflated via the <fragment> tag: id=0x");
                    sb.append(Integer.toHexString(resourceId));
                }
            } else if (!findFragmentById.mInLayout) {
                findFragmentById.mInLayout = true;
                FragmentManager fragmentManager2 = this.f35736a;
                findFragmentById.mFragmentManager = fragmentManager2;
                findFragmentById.mHost = fragmentManager2.getHost();
                findFragmentById.onInflate(this.f35736a.getHost().m54398b(), attributeSet, findFragmentById.mSavedFragmentState);
                m54284v = this.f35736a.m54284v(findFragmentById);
                if (FragmentManager.isLoggingEnabled(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Retained Fragment ");
                    sb2.append(findFragmentById);
                    sb2.append(" has been re-attached via the <fragment> tag: id=0x");
                    sb2.append(Integer.toHexString(resourceId));
                }
            } else {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
            }
            ViewGroup viewGroup = (ViewGroup) view;
            FragmentStrictMode.onFragmentTagUsage(findFragmentById, viewGroup);
            findFragmentById.mContainer = viewGroup;
            m54284v.m54163m();
            m54284v.m54166j();
            View view2 = findFragmentById.mView;
            if (view2 == null) {
                throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
            }
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (findFragmentById.mView.getTag() == null) {
                findFragmentById.mView.setTag(string);
            }
            findFragmentById.mView.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC4606a(m54284v));
            return findFragmentById.mView;
        }
        return null;
    }
}