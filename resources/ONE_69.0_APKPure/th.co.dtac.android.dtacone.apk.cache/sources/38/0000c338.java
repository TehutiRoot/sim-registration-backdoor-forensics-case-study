package com.yarolegovich.discretescrollview;

import android.graphics.Point;
import android.view.View;

/* loaded from: classes5.dex */
public enum DSVOrientation {
    HORIZONTAL { // from class: com.yarolegovich.discretescrollview.DSVOrientation.1
        @Override // com.yarolegovich.discretescrollview.DSVOrientation
        public InterfaceC9972a createHelper() {
            return new HorizontalHelper();
        }
    },
    VERTICAL { // from class: com.yarolegovich.discretescrollview.DSVOrientation.2
        @Override // com.yarolegovich.discretescrollview.DSVOrientation
        public InterfaceC9972a createHelper() {
            return new VerticalHelper();
        }
    };

    /* loaded from: classes5.dex */
    public static class HorizontalHelper implements InterfaceC9972a {
        @Override // com.yarolegovich.discretescrollview.DSVOrientation.InterfaceC9972a
        public boolean canScrollHorizontally() {
            return true;
        }

        @Override // com.yarolegovich.discretescrollview.DSVOrientation.InterfaceC9972a
        public boolean canScrollVertically() {
            return false;
        }

        @Override // com.yarolegovich.discretescrollview.DSVOrientation.InterfaceC9972a
        public float getDistanceFromCenter(Point point, int i, int i2) {
            return i - point.x;
        }

        @Override // com.yarolegovich.discretescrollview.DSVOrientation.InterfaceC9972a
        public int getDistanceToChangeCurrent(int i, int i2) {
            return i;
        }

        @Override // com.yarolegovich.discretescrollview.DSVOrientation.InterfaceC9972a
        public int getFlingVelocity(int i, int i2) {
            return i;
        }

        @Override // com.yarolegovich.discretescrollview.DSVOrientation.InterfaceC9972a
        public int getPendingDx(int i) {
            return i;
        }

        @Override // com.yarolegovich.discretescrollview.DSVOrientation.InterfaceC9972a
        public int getPendingDy(int i) {
            return 0;
        }

        @Override // com.yarolegovich.discretescrollview.DSVOrientation.InterfaceC9972a
        public int getViewEnd(int i, int i2) {
            return i;
        }

        @Override // com.yarolegovich.discretescrollview.DSVOrientation.InterfaceC9972a
        public boolean hasNewBecomeVisible(DiscreteScrollLayoutManager discreteScrollLayoutManager) {
            boolean z;
            boolean z2;
            View m32053M = discreteScrollLayoutManager.m32053M();
            View m32051O = discreteScrollLayoutManager.m32051O();
            int i = -discreteScrollLayoutManager.m32054L();
            int width = discreteScrollLayoutManager.getWidth() + discreteScrollLayoutManager.m32054L();
            if (discreteScrollLayoutManager.getDecoratedLeft(m32053M) > i && discreteScrollLayoutManager.getPosition(m32053M) > 0) {
                z = true;
            } else {
                z = false;
            }
            if (discreteScrollLayoutManager.getDecoratedRight(m32051O) < width && discreteScrollLayoutManager.getPosition(m32051O) < discreteScrollLayoutManager.getItemCount() - 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z && !z2) {
                return false;
            }
            return true;
        }

        @Override // com.yarolegovich.discretescrollview.DSVOrientation.InterfaceC9972a
        public boolean isViewVisible(Point point, int i, int i2, int i3, int i4) {
            int i5 = point.x;
            int i6 = i5 - i;
            int i7 = i5 + i;
            if (i6 < i3 + i4 && i7 > (-i4)) {
                return true;
            }
            return false;
        }

        @Override // com.yarolegovich.discretescrollview.DSVOrientation.InterfaceC9972a
        public void offsetChildren(int i, RecyclerViewProxy recyclerViewProxy) {
            recyclerViewProxy.offsetChildrenHorizontal(i);
        }

        @Override // com.yarolegovich.discretescrollview.DSVOrientation.InterfaceC9972a
        public void setCurrentViewCenter(Point point, int i, Point point2) {
            point2.set(point.x - i, point.y);
        }

        @Override // com.yarolegovich.discretescrollview.DSVOrientation.InterfaceC9972a
        public void shiftViewCenter(Direction direction, int i, Point point) {
            point.set(point.x + direction.applyTo(i), point.y);
        }
    }

    /* loaded from: classes5.dex */
    public static class VerticalHelper implements InterfaceC9972a {
        @Override // com.yarolegovich.discretescrollview.DSVOrientation.InterfaceC9972a
        public boolean canScrollHorizontally() {
            return false;
        }

        @Override // com.yarolegovich.discretescrollview.DSVOrientation.InterfaceC9972a
        public boolean canScrollVertically() {
            return true;
        }

        @Override // com.yarolegovich.discretescrollview.DSVOrientation.InterfaceC9972a
        public float getDistanceFromCenter(Point point, int i, int i2) {
            return i2 - point.y;
        }

        @Override // com.yarolegovich.discretescrollview.DSVOrientation.InterfaceC9972a
        public int getDistanceToChangeCurrent(int i, int i2) {
            return i2;
        }

        @Override // com.yarolegovich.discretescrollview.DSVOrientation.InterfaceC9972a
        public int getFlingVelocity(int i, int i2) {
            return i2;
        }

        @Override // com.yarolegovich.discretescrollview.DSVOrientation.InterfaceC9972a
        public int getPendingDx(int i) {
            return 0;
        }

        @Override // com.yarolegovich.discretescrollview.DSVOrientation.InterfaceC9972a
        public int getPendingDy(int i) {
            return i;
        }

        @Override // com.yarolegovich.discretescrollview.DSVOrientation.InterfaceC9972a
        public int getViewEnd(int i, int i2) {
            return i2;
        }

        @Override // com.yarolegovich.discretescrollview.DSVOrientation.InterfaceC9972a
        public boolean hasNewBecomeVisible(DiscreteScrollLayoutManager discreteScrollLayoutManager) {
            boolean z;
            boolean z2;
            View m32053M = discreteScrollLayoutManager.m32053M();
            View m32051O = discreteScrollLayoutManager.m32051O();
            int i = -discreteScrollLayoutManager.m32054L();
            int height = discreteScrollLayoutManager.getHeight() + discreteScrollLayoutManager.m32054L();
            if (discreteScrollLayoutManager.getDecoratedTop(m32053M) > i && discreteScrollLayoutManager.getPosition(m32053M) > 0) {
                z = true;
            } else {
                z = false;
            }
            if (discreteScrollLayoutManager.getDecoratedBottom(m32051O) < height && discreteScrollLayoutManager.getPosition(m32051O) < discreteScrollLayoutManager.getItemCount() - 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z && !z2) {
                return false;
            }
            return true;
        }

        @Override // com.yarolegovich.discretescrollview.DSVOrientation.InterfaceC9972a
        public boolean isViewVisible(Point point, int i, int i2, int i3, int i4) {
            int i5 = point.y;
            int i6 = i5 - i2;
            int i7 = i5 + i2;
            if (i6 < i3 + i4 && i7 > (-i4)) {
                return true;
            }
            return false;
        }

        @Override // com.yarolegovich.discretescrollview.DSVOrientation.InterfaceC9972a
        public void offsetChildren(int i, RecyclerViewProxy recyclerViewProxy) {
            recyclerViewProxy.offsetChildrenVertical(i);
        }

        @Override // com.yarolegovich.discretescrollview.DSVOrientation.InterfaceC9972a
        public void setCurrentViewCenter(Point point, int i, Point point2) {
            point2.set(point.x, point.y - i);
        }

        @Override // com.yarolegovich.discretescrollview.DSVOrientation.InterfaceC9972a
        public void shiftViewCenter(Direction direction, int i, Point point) {
            point.set(point.x, point.y + direction.applyTo(i));
        }
    }

    /* renamed from: com.yarolegovich.discretescrollview.DSVOrientation$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC9972a {
        boolean canScrollHorizontally();

        boolean canScrollVertically();

        float getDistanceFromCenter(Point point, int i, int i2);

        int getDistanceToChangeCurrent(int i, int i2);

        int getFlingVelocity(int i, int i2);

        int getPendingDx(int i);

        int getPendingDy(int i);

        int getViewEnd(int i, int i2);

        boolean hasNewBecomeVisible(DiscreteScrollLayoutManager discreteScrollLayoutManager);

        boolean isViewVisible(Point point, int i, int i2, int i3, int i4);

        void offsetChildren(int i, RecyclerViewProxy recyclerViewProxy);

        void setCurrentViewCenter(Point point, int i, Point point2);

        void shiftViewCenter(Direction direction, int i, Point point);
    }

    public abstract InterfaceC9972a createHelper();
}