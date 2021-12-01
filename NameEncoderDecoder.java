class NameEncoderDecoder {
        public String encode(String name){
            return "NOTFORYOU" + name
                    .replace("e", "1")
                    .replace("u", "2")
                    .replace("i", "3")
                    .replace("o", "4")
                    .replace("a", "5")
                    + "YESNOTFORYOU";
        }
        public String decode(String name) {
            return name
                    .replace("NOTFORYOU","")
                    .replace("YESNOTFORYOU","")
                    .replace("YES","")
                    .replace("1", "e")
                    .replace("2", "u")
                    .replace("3", "i")
                    .replace("4", "o")
                    .replace("5", "a");
        }
        public static void main(String[] args) {
            NameEncoderDecoder nameEncoderDecoder = new NameEncoderDecoder();
            System.out.println(nameEncoderDecoder.encode("Crab"));
            System.out.println(nameEncoderDecoder.decode("NOTFORYOUCr5bYESNOTFORYOU"));
            System.out.println(nameEncoderDecoder.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU"));
        }
    }
