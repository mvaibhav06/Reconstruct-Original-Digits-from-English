class Solution {
    public String originalDigits(String s) {
        // z e r o
        // o n e
        // t w o
        // t h r e e
        // f o u r
        // f i v e
        // s i x
        // s e v e n
        // e i g h t
        // n i n e

        // e -> 1,3,5,7,8,9
        // f -> 4,5
        // g -> 8
        // h -> 3,8
        // i -> 5,6,8,9
        // n -> 1,7,9
        // o -> 1,2,4
        // r -> 3,4
        // s -> 6,7
        // t -> 2,3,8
        // u -> 4
        // v -> 5,7
        // w -> 2
        // x -> 6

        // g -> 8, u -> 4, w -> 2, x -> 6
        // f -> 4 or 5 -> if u in there -> 4 or 5
        // h -> 3 or 8 -> if g in there -> 8 or 3
        // s -> 6 or 7 -> if x in there -> 6 or 7
        // 1 9    
        s = s.toLowerCase();
        List<Integer> out = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s);
        while(sb.length() > 0){

            while(sb.indexOf("z") != -1){
                int index = sb.indexOf("z");
                out.add(0);

                int id1 = sb.indexOf("z");
                sb.deleteCharAt(id1);

                id1 = sb.indexOf("e");
                sb.deleteCharAt(id1);

                id1 = sb.indexOf("r");
                sb.deleteCharAt(id1);

                id1 = sb.indexOf("o");
                sb.deleteCharAt(id1);
            }

            while(sb.indexOf("g") != -1){
                int index = sb.indexOf("g");
                out.add(8);
                
                int id1 = sb.indexOf("e");
                sb.deleteCharAt(id1);
                
                id1 = sb.indexOf("i");
                sb.deleteCharAt(id1);

                id1 = sb.indexOf("g");
                sb.deleteCharAt(id1);

                id1 = sb.indexOf("h");
                sb.deleteCharAt(id1);

                id1 = sb.indexOf("t");
                sb.deleteCharAt(id1);
            }
            while(sb.indexOf("u") != -1){
                int index = sb.indexOf("u");
                out.add(4);

                int id1 = sb.indexOf("f");
                sb.deleteCharAt(id1);

                id1 = sb.indexOf("o");
                sb.deleteCharAt(id1);

                id1 = sb.indexOf("u");
                sb.deleteCharAt(id1);

                id1 = sb.indexOf("r");
                sb.deleteCharAt(id1);
            }
            while(sb.indexOf("w") != -1){
                int index = sb.indexOf("w");
                out.add(2);

                int id1 = sb.indexOf("t");
                sb.deleteCharAt(id1);

                id1 = sb.indexOf("w");
                sb.deleteCharAt(id1);

                id1 = sb.indexOf("o");
                sb.deleteCharAt(id1);
            }
            while(sb.indexOf("x") != -1){
                int index = sb.indexOf("x");
                out.add(6);

                sb.deleteCharAt(index);

                int id1 = sb.indexOf("s");
                sb.deleteCharAt(id1);

                id1 = sb.indexOf("i");
                sb.deleteCharAt(id1);
            }
            while(sb.indexOf("f") != -1){
                int index = sb.indexOf("f");
                out.add(5);

                sb.deleteCharAt(index);

                int id1 = sb.indexOf("i");
                sb.deleteCharAt(id1);

                id1 = sb.indexOf("v");
                sb.deleteCharAt(id1);

                
                id1 = sb.indexOf("e");
                sb.deleteCharAt(id1);
            }
            while(sb.indexOf("h") != -1){
                int index = sb.indexOf("h");
                out.add(3);

                sb.deleteCharAt(index);

                int id1 = sb.indexOf("t");
                sb.deleteCharAt(id1);

                id1 = sb.indexOf("r");
                sb.deleteCharAt(id1);

                id1 = sb.indexOf("e");
                sb.deleteCharAt(id1);

                id1 = sb.indexOf("e");
                sb.deleteCharAt(id1);
            }

            while(sb.indexOf("s") != -1){
                out.add(7);

                int id1 = sb.indexOf("s");
                sb.deleteCharAt(id1);

                id1 = sb.indexOf("e");
                sb.deleteCharAt(id1);

                id1 = sb.indexOf("v");
                sb.deleteCharAt(id1);

                id1 = sb.indexOf("e");
                sb.deleteCharAt(id1);

                id1 = sb.indexOf("n");
                sb.deleteCharAt(id1);

            }
            while(sb.indexOf("o") != -1){
                out.add(1);

                int id1 = sb.indexOf("o");
                sb.deleteCharAt(id1);

                id1 = sb.indexOf("n");
                sb.deleteCharAt(id1);

                id1 = sb.indexOf("e");
                sb.deleteCharAt(id1);

            }
            while(sb.indexOf("n") != -1){
                out.add(9);
                
                int id1 = sb.indexOf("n");
                sb.deleteCharAt(id1);

                id1 = sb.indexOf("i");
                sb.deleteCharAt(id1);

                id1 = sb.indexOf("n");
                sb.deleteCharAt(id1);

                id1 = sb.indexOf("e");
                sb.deleteCharAt(id1);
            }
        }
        Collections.sort(out);
        String temp = "";
        StringBuilder sb1 = new StringBuilder("");
        for(int a : out){
            sb1.append(a);
        }
        return sb1.toString();
    }
}
