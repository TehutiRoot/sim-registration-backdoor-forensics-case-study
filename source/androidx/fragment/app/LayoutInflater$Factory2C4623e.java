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
public class LayoutInflater$Factory2C4623e implements LayoutInflater.Factory2 {

    /* renamed from: a */
    public final FragmentManager f35648a;

    /* renamed from: androidx.fragment.app.e$a */
    /* loaded from: classes2.dex */
    public class View$OnAttachStateChangeListenerC4624a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C4633j f35649a;

        public View$OnAttachStateChangeListenerC4624a(C4633j c4633j) {
            this.f35649a = c4633j;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment m54214k = this.f35649a.m54214k();
            this.f35649a.m54212m();
            SpecialEffectsController.getOrCreateController((ViewGroup) m54214k.mView.getParent(), LayoutInflater$Factory2C4623e.this.f35648a).forceCompleteAllOperations();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public LayoutInflater$Factory2C4623e(FragmentManager fragmentManager) {
        this.f35648a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C4633j m54334v;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f35648a);
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
            if (attributeValue == null || !FragmentFactory.m54451a(context.getClassLoader(), attributeValue)) {
                return null;
            }
            int id2 = view != null ? view.getId() : 0;
            if (id2 == -1 && resourceId == -1 && string == null) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
            }
            Fragment findFragmentById = resourceId != -1 ? this.f35648a.findFragmentById(resourceId) : null;
            if (findFragmentById == null && string != null) {
                findFragmentById = this.f35648a.findFragmentByTag(string);
            }
            if (findFragmentById == null && id2 != -1) {
                findFragmentById = this.f35648a.findFragmentById(id2);
            }
            if (findFragmentById == null) {
                findFragmentById = this.f35648a.getFragmentFactory().instantiate(context.getClassLoader(), attributeValue);
                findFragmentById.mFromLayout = true;
                findFragmentById.mFragmentId = resourceId != 0 ? resourceId : id2;
                findFragmentById.mContainerId = id2;
                findFragmentById.mTag = string;
                findFragmentById.mInLayout = true;
                FragmentManager fragmentManager = this.f35648a;
                findFragmentById.mFragmentManager = fragmentManager;
                findFragmentById.mHost = fragmentManager.getHost();
                findFragmentById.onInflate(this.f35648a.getHost().m54448b(), attributeSet, findFragmentById.mSavedFragmentState);
                m54334v = this.f35648a.m54366j(findFragmentById);
                if (FragmentManager.isLoggingEnabled(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Fragment ");
                    sb.append(findFragmentById);
                    sb.append(" has been inflated via the <fragment> tag: id=0x");
                    sb.append(Integer.toHexString(resourceId));
                }
            } else if (!findFragmentById.mInLayout) {
                findFragmentById.mInLayout = true;
                FragmentManager fragmentManager2 = this.f35648a;
                findFragmentById.mFragmentManager = fragmentManager2;
                findFragmentById.mHost = fragmentManager2.getHost();
                findFragmentById.onInflate(this.f35648a.getHost().m54448b(), attributeSet, findFragmentById.mSavedFragmentState);
                m54334v = this.f35648a.m54334v(findFragmentById);
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
            m54334v.m54212m();
            m54334v.m54215j();
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
            findFragmentById.mView.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC4624a(m54334v));
            return findFragmentById.mView;
        }
        return null;
    }
}
