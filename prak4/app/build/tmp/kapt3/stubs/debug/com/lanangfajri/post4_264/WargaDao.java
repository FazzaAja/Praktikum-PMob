package com.lanangfajri.post4_264;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0017J\b\u0010\u0004\u001a\u00020\u0003H\'J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H\'J\b\u0010\n\u001a\u00020\u0003H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/lanangfajri/post4_264/WargaDao;", "", "clearAndResetAllData", "", "deleteAll", "getAllWarga", "", "Lcom/lanangfajri/post4_264/Warga;", "insert", "warga", "resetAutoIncrementSequence", "app_debug"})
@androidx.room.Dao()
public abstract interface WargaDao {
    
    @androidx.room.Insert(onConflict = 5)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.lanangfajri.post4_264.Warga warga);
    
    @androidx.room.Query(value = "DELETE FROM tabel_warga")
    public abstract void deleteAll();
    
    @androidx.room.Query(value = "SELECT * from tabel_warga ORDER BY id ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.lanangfajri.post4_264.Warga> getAllWarga();
    
    @androidx.room.Query(value = "DELETE FROM sqlite_sequence WHERE name = \'tabel_warga\'")
    public abstract void resetAutoIncrementSequence();
    
    @androidx.room.Transaction()
    public abstract void clearAndResetAllData();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        @androidx.room.Transaction()
        public static void clearAndResetAllData(@org.jetbrains.annotations.NotNull()
        com.lanangfajri.post4_264.WargaDao $this) {
        }
    }
}