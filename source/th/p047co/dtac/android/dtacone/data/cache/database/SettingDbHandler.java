package th.p047co.dtac.android.dtacone.data.cache.database;

import io.realm.ImportFlag;
import io.realm.Realm;
import io.realm.RealmResults;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import th.p047co.dtac.android.dtacone.model.database.SettingModel;

/* renamed from: th.co.dtac.android.dtacone.data.cache.database.SettingDbHandler */
/* loaded from: classes7.dex */
public class SettingDbHandler extends DatabaseHandler<SettingModel> {
    public SettingDbHandler() {
        super(SettingModel.class);
    }

    @Override // th.p047co.dtac.android.dtacone.data.cache.database.DatabaseHandler
    public List<SettingModel> getAllData() {
        openDb();
        RealmResults findAll = this.realm.where(SettingModel.class).findAll();
        if (findAll == null) {
            return Collections.emptyList();
        }
        return new ArrayList(Arrays.asList((SettingModel[]) findAll.toArray(new SettingModel[findAll.size()])));
    }

    @Override // th.p047co.dtac.android.dtacone.data.cache.database.DatabaseHandler
    public void delete(SettingModel settingModel) {
        if (settingModel == null) {
            return;
        }
        openDb();
        this.realm.beginTransaction();
        if (settingModel.isValid()) {
            settingModel.deleteFromRealm();
        } else {
            SettingModel findFirst = findFirst(settingModel.getKey());
            if (findFirst != null) {
                findFirst.deleteFromRealm();
            }
        }
        this.realm.commitTransaction();
    }

    @Override // th.p047co.dtac.android.dtacone.data.cache.database.DatabaseHandler
    public void insertOrUpdate(List<SettingModel> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        openDb();
        if (list.size() >= 1 && !list.get(0).isValid()) {
            this.realm.beginTransaction();
            this.realm.copyToRealmOrUpdate(list, new ImportFlag[0]);
            this.realm.commitTransaction();
            return;
        }
        this.realm.beginTransaction();
        for (SettingModel settingModel : list) {
            if (settingModel != null) {
                SettingModel findFirst = findFirst(settingModel.getKey());
                if (findFirst == null) {
                    findFirst = (SettingModel) this.realm.createObject(SettingModel.class);
                }
                findFirst.setKey(settingModel.getKey());
                findFirst.setValue(settingModel.getValue());
                findFirst.setRemark(settingModel.getRemark());
                this.realm.copyToRealmOrUpdate((Realm) findFirst, new ImportFlag[0]);
            }
        }
        this.realm.commitTransaction();
    }

    @Override // th.p047co.dtac.android.dtacone.data.cache.database.DatabaseHandler
    public void insertOrUpdate(SettingModel settingModel) {
        if (settingModel == null) {
            return;
        }
        openDb();
        if (!settingModel.isValid()) {
            this.realm.beginTransaction();
            this.realm.copyToRealmOrUpdate((Realm) settingModel, new ImportFlag[0]);
            this.realm.commitTransaction();
            return;
        }
        SettingModel findFirst = findFirst(settingModel.getKey());
        this.realm.beginTransaction();
        if (findFirst == null) {
            findFirst = (SettingModel) this.realm.createObject(SettingModel.class);
        }
        findFirst.setKey(settingModel.getKey());
        findFirst.setValue(settingModel.getValue());
        findFirst.setRemark(settingModel.getRemark());
        this.realm.copyToRealmOrUpdate((Realm) findFirst, new ImportFlag[0]);
        this.realm.commitTransaction();
    }
}
