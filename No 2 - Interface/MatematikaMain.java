class MatematikaMain {
  public static void main(String[] args) {
    Matematika mtk = new Matematika();

    int hasilTambah = mtk.Tambah(20, 10);
    int hasilKurang = mtk.Kurang(10, 5);
    int hasilKali = mtk.Kali(10, 3);
    int hasilBagi = mtk.Bagi(21, 2);

    System.out.println("Pertambahan : 20+30 = " + hasilTambah);
    System.out.println("Pengurangan : 10-5 = " + hasilKurang);
    System.out.println("Perkalian : 10*3 = " + hasilKali);
    System.out.println("Pembagian : 21/2 = " + hasilBagi);
  }
}
