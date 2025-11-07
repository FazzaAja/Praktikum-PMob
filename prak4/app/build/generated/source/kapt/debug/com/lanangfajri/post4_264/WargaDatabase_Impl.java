package com.lanangfajri.post4_264;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class WargaDatabase_Impl extends WargaDatabase {
  private volatile WargaDao _wargaDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `tabel_warga` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `nama` TEXT, `nik` TEXT, `kabupaten` TEXT, `kecamatan` TEXT, `desa` TEXT, `rt` TEXT, `rw` TEXT, `jenis_kelamin` TEXT, `status_pernikahan` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '48b567f19ab3eedb31dd92f26d29ae9c')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `tabel_warga`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsTabelWarga = new HashMap<String, TableInfo.Column>(10);
        _columnsTabelWarga.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTabelWarga.put("nama", new TableInfo.Column("nama", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTabelWarga.put("nik", new TableInfo.Column("nik", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTabelWarga.put("kabupaten", new TableInfo.Column("kabupaten", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTabelWarga.put("kecamatan", new TableInfo.Column("kecamatan", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTabelWarga.put("desa", new TableInfo.Column("desa", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTabelWarga.put("rt", new TableInfo.Column("rt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTabelWarga.put("rw", new TableInfo.Column("rw", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTabelWarga.put("jenis_kelamin", new TableInfo.Column("jenis_kelamin", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTabelWarga.put("status_pernikahan", new TableInfo.Column("status_pernikahan", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTabelWarga = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTabelWarga = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTabelWarga = new TableInfo("tabel_warga", _columnsTabelWarga, _foreignKeysTabelWarga, _indicesTabelWarga);
        final TableInfo _existingTabelWarga = TableInfo.read(_db, "tabel_warga");
        if (! _infoTabelWarga.equals(_existingTabelWarga)) {
          return new RoomOpenHelper.ValidationResult(false, "tabel_warga(com.lanangfajri.post4_264.Warga).\n"
                  + " Expected:\n" + _infoTabelWarga + "\n"
                  + " Found:\n" + _existingTabelWarga);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "48b567f19ab3eedb31dd92f26d29ae9c", "09cc875bc9c337861e3e787f6c39f02e");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "tabel_warga");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `tabel_warga`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(WargaDao.class, WargaDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public WargaDao wargaDao() {
    if (_wargaDao != null) {
      return _wargaDao;
    } else {
      synchronized(this) {
        if(_wargaDao == null) {
          _wargaDao = new WargaDao_Impl(this);
        }
        return _wargaDao;
      }
    }
  }
}
