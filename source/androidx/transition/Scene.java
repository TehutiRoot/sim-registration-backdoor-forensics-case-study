package androidx.transition;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public class Scene {

    /* renamed from: a */
    public Context f37727a;

    /* renamed from: b */
    public int f37728b;

    /* renamed from: c */
    public ViewGroup f37729c;

    /* renamed from: d */
    public View f37730d;

    /* renamed from: e */
    public Runnable f37731e;

    /* renamed from: f */
    public Runnable f37732f;

    public Scene(@NonNull ViewGroup viewGroup) {
        this.f37728b = -1;
        this.f37729c = viewGroup;
    }

    /* renamed from: b */
    public static void m52659b(ViewGroup viewGroup, Scene scene) {
        viewGroup.setTag(R.id.transition_current_scene, scene);
    }

    @Nullable
    public static Scene getCurrentScene(@NonNull ViewGroup viewGroup) {
        return (Scene) viewGroup.getTag(R.id.transition_current_scene);
    }

    @NonNull
    public static Scene getSceneForLayout(@NonNull ViewGroup viewGroup, @LayoutRes int i, @NonNull Context context) {
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(R.id.transition_scene_layoutid_cache);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(R.id.transition_scene_layoutid_cache, sparseArray);
        }
        Scene scene = (Scene) sparseArray.get(i);
        if (scene != null) {
            return scene;
        }
        Scene scene2 = new Scene(viewGroup, i, context);
        sparseArray.put(i, scene2);
        return scene2;
    }

    /* renamed from: a */
    public boolean m52660a() {
        if (this.f37728b > 0) {
            return true;
        }
        return false;
    }

    public void enter() {
        if (this.f37728b > 0 || this.f37730d != null) {
            getSceneRoot().removeAllViews();
            if (this.f37728b > 0) {
                LayoutInflater.from(this.f37727a).inflate(this.f37728b, this.f37729c);
            } else {
                this.f37729c.addView(this.f37730d);
            }
        }
        Runnable runnable = this.f37731e;
        if (runnable != null) {
            runnable.run();
        }
        m52659b(this.f37729c, this);
    }

    public void exit() {
        Runnable runnable;
        if (getCurrentScene(this.f37729c) == this && (runnable = this.f37732f) != null) {
            runnable.run();
        }
    }

    @NonNull
    public ViewGroup getSceneRoot() {
        return this.f37729c;
    }

    public void setEnterAction(@Nullable Runnable runnable) {
        this.f37731e = runnable;
    }

    public void setExitAction(@Nullable Runnable runnable) {
        this.f37732f = runnable;
    }

    public Scene(ViewGroup viewGroup, int i, Context context) {
        this.f37727a = context;
        this.f37729c = viewGroup;
        this.f37728b = i;
    }

    public Scene(@NonNull ViewGroup viewGroup, @NonNull View view) {
        this.f37728b = -1;
        this.f37729c = viewGroup;
        this.f37730d = view;
    }
}
