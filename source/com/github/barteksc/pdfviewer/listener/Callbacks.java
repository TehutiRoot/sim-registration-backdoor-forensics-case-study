package com.github.barteksc.pdfviewer.listener;

import android.view.MotionEvent;
import com.github.barteksc.pdfviewer.link.LinkHandler;
import com.github.barteksc.pdfviewer.model.LinkTapEvent;

/* loaded from: classes3.dex */
public class Callbacks {

    /* renamed from: a */
    public OnLoadCompleteListener f43652a;

    /* renamed from: b */
    public OnErrorListener f43653b;

    /* renamed from: c */
    public OnPageErrorListener f43654c;

    /* renamed from: d */
    public OnRenderListener f43655d;

    /* renamed from: e */
    public OnPageChangeListener f43656e;

    /* renamed from: f */
    public OnPageScrollListener f43657f;

    /* renamed from: g */
    public OnDrawListener f43658g;

    /* renamed from: h */
    public OnDrawListener f43659h;

    /* renamed from: i */
    public OnTapListener f43660i;

    /* renamed from: j */
    public OnLongPressListener f43661j;

    /* renamed from: k */
    public LinkHandler f43662k;

    public void callLinkHandler(LinkTapEvent linkTapEvent) {
        LinkHandler linkHandler = this.f43662k;
        if (linkHandler != null) {
            linkHandler.handleLinkEvent(linkTapEvent);
        }
    }

    public void callOnLoadComplete(int i) {
        OnLoadCompleteListener onLoadCompleteListener = this.f43652a;
        if (onLoadCompleteListener != null) {
            onLoadCompleteListener.loadComplete(i);
        }
    }

    public void callOnLongPress(MotionEvent motionEvent) {
        OnLongPressListener onLongPressListener = this.f43661j;
        if (onLongPressListener != null) {
            onLongPressListener.onLongPress(motionEvent);
        }
    }

    public void callOnPageChange(int i, int i2) {
        OnPageChangeListener onPageChangeListener = this.f43656e;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageChanged(i, i2);
        }
    }

    public boolean callOnPageError(int i, Throwable th2) {
        OnPageErrorListener onPageErrorListener = this.f43654c;
        if (onPageErrorListener != null) {
            onPageErrorListener.onPageError(i, th2);
            return true;
        }
        return false;
    }

    public void callOnPageScroll(int i, float f) {
        OnPageScrollListener onPageScrollListener = this.f43657f;
        if (onPageScrollListener != null) {
            onPageScrollListener.onPageScrolled(i, f);
        }
    }

    public void callOnRender(int i) {
        OnRenderListener onRenderListener = this.f43655d;
        if (onRenderListener != null) {
            onRenderListener.onInitiallyRendered(i);
        }
    }

    public boolean callOnTap(MotionEvent motionEvent) {
        OnTapListener onTapListener = this.f43660i;
        if (onTapListener != null && onTapListener.onTap(motionEvent)) {
            return true;
        }
        return false;
    }

    public OnDrawListener getOnDraw() {
        return this.f43658g;
    }

    public OnDrawListener getOnDrawAll() {
        return this.f43659h;
    }

    public OnErrorListener getOnError() {
        return this.f43653b;
    }

    public void setLinkHandler(LinkHandler linkHandler) {
        this.f43662k = linkHandler;
    }

    public void setOnDraw(OnDrawListener onDrawListener) {
        this.f43658g = onDrawListener;
    }

    public void setOnDrawAll(OnDrawListener onDrawListener) {
        this.f43659h = onDrawListener;
    }

    public void setOnError(OnErrorListener onErrorListener) {
        this.f43653b = onErrorListener;
    }

    public void setOnLoadComplete(OnLoadCompleteListener onLoadCompleteListener) {
        this.f43652a = onLoadCompleteListener;
    }

    public void setOnLongPress(OnLongPressListener onLongPressListener) {
        this.f43661j = onLongPressListener;
    }

    public void setOnPageChange(OnPageChangeListener onPageChangeListener) {
        this.f43656e = onPageChangeListener;
    }

    public void setOnPageError(OnPageErrorListener onPageErrorListener) {
        this.f43654c = onPageErrorListener;
    }

    public void setOnPageScroll(OnPageScrollListener onPageScrollListener) {
        this.f43657f = onPageScrollListener;
    }

    public void setOnRender(OnRenderListener onRenderListener) {
        this.f43655d = onRenderListener;
    }

    public void setOnTap(OnTapListener onTapListener) {
        this.f43660i = onTapListener;
    }
}
