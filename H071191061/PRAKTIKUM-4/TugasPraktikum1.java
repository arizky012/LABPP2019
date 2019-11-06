 class TugasPraktikum1 {
    public static void main(String[] args) {
        char[] huruf = {'A','B','C'};
        System.out.print("{");
        for (int i = 0; i < huruf.length; i++) {
            System.out.printf("%d%s",(int)huruf[i],i == huruf.length -1 ? "":",");
        }
        System.out.println("}");
    }
}