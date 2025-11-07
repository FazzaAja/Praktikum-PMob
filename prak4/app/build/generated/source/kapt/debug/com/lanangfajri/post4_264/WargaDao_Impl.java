package com.lanangfajri.post4_264;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class WargaDao_Impl implements WargaDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Warga> __insertionAdapterOfWarga;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfResetAutoIncrementSequence;

  public WargaDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWarga = new EntityInsertionAdapter<Warga>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `tabel_warga` (`id`,`nama`,`nik`,`kabupaten`,`kecamatan`,`desa`,`rt`,`rw`,`jenis_kelamin`,`status_pernikahan`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Warga value) {
        stmt.bindLong(1, value.getId());
        if (value.getNama() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNama());
        }
        if (value.getNik() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNik());
        }
        if (value.getKabupaten() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getKabupaten());
        }
        if (value.getKecamatan() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getKecamatan());
        }
        if (value.getDesa() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDesa());
        }
        if (value.getRt() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getRt());
        }
        if (value.getRw() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getRw());
        }
        if (value.getJenisKelamin() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getJenisKelamin());
        }
        if (value.getStatusPernikahan() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getStatusPernikahan());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM tabel_warga";
        return _query;
      }
    };
    this.__preparedStmtOfResetAutoIncrementSequence = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM sqlite_sequence WHERE name = 'tabel_warga'";
        return _query;
      }
    };
  }

  @Override
  public void insert(final Warga warga) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfWarga.insert(warga);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void clearAndResetAllData() {
    __db.beginTransaction();
    try {
      WargaDao.DefaultImpls.clearAndResetAllData(WargaDao_Impl.this);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public void resetAutoIncrementSequence() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfResetAutoIncrementSequence.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfResetAutoIncrementSequence.release(_stmt);
    }
  }

  @Override
  public List<Warga> getAllWarga() {
    final String _sql = "SELECT * from tabel_warga ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfNama = CursorUtil.getColumnIndexOrThrow(_cursor, "nama");
      final int _cursorIndexOfNik = CursorUtil.getColumnIndexOrThrow(_cursor, "nik");
      final int _cursorIndexOfKabupaten = CursorUtil.getColumnIndexOrThrow(_cursor, "kabupaten");
      final int _cursorIndexOfKecamatan = CursorUtil.getColumnIndexOrThrow(_cursor, "kecamatan");
      final int _cursorIndexOfDesa = CursorUtil.getColumnIndexOrThrow(_cursor, "desa");
      final int _cursorIndexOfRt = CursorUtil.getColumnIndexOrThrow(_cursor, "rt");
      final int _cursorIndexOfRw = CursorUtil.getColumnIndexOrThrow(_cursor, "rw");
      final int _cursorIndexOfJenisKelamin = CursorUtil.getColumnIndexOrThrow(_cursor, "jenis_kelamin");
      final int _cursorIndexOfStatusPernikahan = CursorUtil.getColumnIndexOrThrow(_cursor, "status_pernikahan");
      final List<Warga> _result = new ArrayList<Warga>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Warga _item;
        _item = new Warga();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpNama;
        if (_cursor.isNull(_cursorIndexOfNama)) {
          _tmpNama = null;
        } else {
          _tmpNama = _cursor.getString(_cursorIndexOfNama);
        }
        _item.setNama(_tmpNama);
        final String _tmpNik;
        if (_cursor.isNull(_cursorIndexOfNik)) {
          _tmpNik = null;
        } else {
          _tmpNik = _cursor.getString(_cursorIndexOfNik);
        }
        _item.setNik(_tmpNik);
        final String _tmpKabupaten;
        if (_cursor.isNull(_cursorIndexOfKabupaten)) {
          _tmpKabupaten = null;
        } else {
          _tmpKabupaten = _cursor.getString(_cursorIndexOfKabupaten);
        }
        _item.setKabupaten(_tmpKabupaten);
        final String _tmpKecamatan;
        if (_cursor.isNull(_cursorIndexOfKecamatan)) {
          _tmpKecamatan = null;
        } else {
          _tmpKecamatan = _cursor.getString(_cursorIndexOfKecamatan);
        }
        _item.setKecamatan(_tmpKecamatan);
        final String _tmpDesa;
        if (_cursor.isNull(_cursorIndexOfDesa)) {
          _tmpDesa = null;
        } else {
          _tmpDesa = _cursor.getString(_cursorIndexOfDesa);
        }
        _item.setDesa(_tmpDesa);
        final String _tmpRt;
        if (_cursor.isNull(_cursorIndexOfRt)) {
          _tmpRt = null;
        } else {
          _tmpRt = _cursor.getString(_cursorIndexOfRt);
        }
        _item.setRt(_tmpRt);
        final String _tmpRw;
        if (_cursor.isNull(_cursorIndexOfRw)) {
          _tmpRw = null;
        } else {
          _tmpRw = _cursor.getString(_cursorIndexOfRw);
        }
        _item.setRw(_tmpRw);
        final String _tmpJenisKelamin;
        if (_cursor.isNull(_cursorIndexOfJenisKelamin)) {
          _tmpJenisKelamin = null;
        } else {
          _tmpJenisKelamin = _cursor.getString(_cursorIndexOfJenisKelamin);
        }
        _item.setJenisKelamin(_tmpJenisKelamin);
        final String _tmpStatusPernikahan;
        if (_cursor.isNull(_cursorIndexOfStatusPernikahan)) {
          _tmpStatusPernikahan = null;
        } else {
          _tmpStatusPernikahan = _cursor.getString(_cursorIndexOfStatusPernikahan);
        }
        _item.setStatusPernikahan(_tmpStatusPernikahan);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
