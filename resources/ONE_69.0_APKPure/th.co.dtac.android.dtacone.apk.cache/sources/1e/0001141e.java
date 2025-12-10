package th.p047co.dtac.android.dtacone.data.cache.database;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;
import java.util.Collections;
import java.util.List;

/* renamed from: th.co.dtac.android.dtacone.data.cache.database.DatabaseHandler */
/* loaded from: classes7.dex */
public abstract class DatabaseHandler<T extends RealmObject> {
    protected Class<T> CType;
    protected Realm realm;

    public DatabaseHandler(Class<T> cls) {
        this.CType = cls;
    }

    public void closeDb() {
        Realm realm = this.realm;
        if (realm != null) {
            realm.close();
        }
    }

    public abstract void delete(T t);

    public void deleteAll() {
        openDb();
        this.realm.beginTransaction();
        this.realm.delete(getType());
        this.realm.commitTransaction();
    }

    public void deleteTable() {
        openDb();
        this.realm.where(getType()).findAll().deleteAllFromRealm();
    }

    public T findFirst(String str) {
        openDb();
        return (T) this.realm.where(getType()).equalTo(getType().getDeclaredFields()[0].getName(), str).findFirst();
    }

    public List<T> getAllData() {
        openDb();
        RealmResults findAll = this.realm.where(getType()).findAll();
        if (findAll == null) {
            return Collections.emptyList();
        }
        return findAll.subList(0, findAll.size() - 1);
    }

    public T getData(String str) {
        return findFirst(str);
    }

    public Class<T> getType() {
        return this.CType;
    }

    public abstract void insertOrUpdate(T t);

    public abstract void insertOrUpdate(List<T> list);

    public void openDb() {
        Realm realm = this.realm;
        if (realm == null || realm.isClosed()) {
            this.realm = Realm.getDefaultInstance();
        }
    }

    public T findFirst() {
        openDb();
        return (T) this.realm.where(getType()).findFirst();
    }
}