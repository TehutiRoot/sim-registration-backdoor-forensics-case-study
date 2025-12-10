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
    public Context f37815a;

    /* renamed from: b */
    public int f37816b;

    /* renamed from: c */
    public ViewGroup f37817c;

    /* renamed from: d */
    public View f37818d;

    /* renamed from: e */
    public Runnable f37819e;

    /* renamed from: f */
    public Runnable f37820f;

    public Scene(@NonNull ViewGroup viewGroup) {
        this.f37816b = -1;
        this.f37817c = viewGroup;
    }

    /* renamed from: b */
    public static void m52610b(ViewGroup viewGroup, Scene scene) {
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
    public boolean m52611a() {
        if (this.f37816b > 0) {
            return true;
        }
        return false;
    }

    public void enter() {
        if (this.f37816b > 0 || this.f37818d != null) {
            getSceneRoot().removeAllViews();
            if (this.f37816b > 0) {
                LayoutInflater.from(this.f37815a).inflate(this.f37816b, this.f37817c);
            } else {
                this.f37817c.addView(this.f37818d);
            }
        }
        Runnable runnable = this.f37819e;
        if (runnable != null) {
            runnable.run();
        }
        m52610b(this.f37817c, this);
    }

    public void exit() {
        Runnable runnable;
        if (getCurrentScene(this.f37817c) == this && (runnable = this.f37820f) != null) {
            runnable.run();
        }
    }

    @NonNull
    public ViewGroup getSceneRoot() {
        return this.f37817c;
    }

    public void setEnterAction(@Nullable Runnable runnable) {
        this.f37819e = runnable;
    }

    public void setExitAction(@Nullable Runnable runnable) {
        this.f37820f = runnable;
    }

    public Scene(ViewGroup viewGroup, int i, Context context) {
        this.f37815a = context;
        this.f37817c = viewGroup;
        this.f37816b = i;
    }

    public Scene(@NonNull ViewGroup viewGroup, @NonNull View view) {
        this.f37816b = -1;
        this.f37817c = viewGroup;
        this.f37818d = view;
    }
}