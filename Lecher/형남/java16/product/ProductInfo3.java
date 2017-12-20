package java16.product;

import java.util.Scanner;

public class ProductInfo3 {
    
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        int n = 0, s = 0, id = 0, price = 0, is = 0;
        int book =0, cd =0, conbook=0;
        String pe, pr, name = null, au = null, lang = null;
        
        Book[] boo = new Book[10];
        CompactDisc[] com = new CompactDisc[10];
        ConversationBook[] cvb = new ConversationBook[10];
        for(;;){
            System.out.print("상품 추가<1>. 모든상품조회<2>, 끝내기<3>>>>");
            n = key.nextInt();
            if(n==1 && id<=10){//상품추가
                
                System.out.print("상품 종류 책<1>, 음악CD<2>, 회화책<3>>>>");
                s = key.nextInt();
                if(s==1 || s == 2||s==3){// 책 음악
                    System.out.print("상품 설명>>");//pe
                    pe = key.next();
                    System.out.print("생산자>>");//pr
                    pr = key.next();
                    System.out.print("가격>>");//p
                    price = key.nextInt();
                    if(s==1 || s==3){// 책 회화책
                        System.out.print("책제목>>");//name
                        name = key.next();
                        System.out.print("저자>>");//au
                        au = key.next();
                        if(s==3) {//회화책
                            System.out.print("언어>>");//lang
                            lang = key.next();
                        }
                        System.out.print("ISBN>>");//is
                        is = key.nextInt();
                    } else if (s==2){// 음악cd
                        System.out.print("앨범 제목>>");//name
                        name = key.next();
                        System.out.print("가수>>");//au
                        au = key.next();
                    }
                    
                    if(s==1){
                        boo[book] =new Book(id, pe, pr, price, is, au, name);
                        book++;
                    } else if (s==2) {
                        com[cd] = new CompactDisc(id, pe, pr, price, name, au);
                        cd++;
                    } else if (s==3) {
                        cvb[conbook] = new ConversationBook(id, pe, pr, price, is, au, name, lang);
                        conbook++;
                    }
                    
                    id++;
                } // 상품추가 끝
            } else if (n==1 && id>10){
                System.out.println("더 이상 상품을 추가할 수 없습니다.");
                continue;
            } else if (n==2) {//모든상품조회
                if (book>0){
                    for(int i=0; i<=book; i++){
                    System.out.println("상품ID>>"+boo[i].getId());
                    System.out.println("상품설명>>"+boo[i].getPe());
                    System.out.println("생산자>>"+boo[i].getPr());
                    System.out.println("가격>>"+boo[i].getPrice());
                    System.out.println("저자>>"+boo[i].getAuthor());
                    System.out.println("책제목>>"+boo[i].getBookname());
                    System.out.println("ISBN>>"+boo[i].getIsbn());
                    }
                } else {
                    continue;
                }
                if (cd>0){
                    for(int i=0; i<=cd; i++){
                    System.out.println("상품ID>>"+com[i].getId());
                    System.out.println("상품설명>>"+com[i].getPe());
                    System.out.println("생산자>>"+com[i].getPr());
                    System.out.println("가격>>"+com[i].getPrice());
                    System.out.println("가수이름>>"+com[i].getSingername());
                    System.out.println("앨범제목>>"+com[i].getAlbumname());                    
                    }
                } else {
                    continue;
                }
                if (conbook>0){
                    for(int i=0; i<=conbook; i++){
                    System.out.println("상품ID>>"+cvb[i].getId());
                    System.out.println("상품설명>>"+cvb[i].getPe());
                    System.out.println("생산자>>"+cvb[i].getPr());
                    System.out.println("가격>>"+cvb[i].getPrice());
                    System.out.println("저자>>"+cvb[i].getAuthor());
                    System.out.println("책제목>>"+cvb[i].getBookname());
                    System.out.println("언어명>>"+cvb[i].getLang());
                    System.out.println("ISBN>>"+cvb[i].getIsbn());
                    }
                } else {
                    continue;
                }
            } else if (n==3) {//끝내기
                break;
            } else {
                System.out.println("1~3사이의 수를 입력하십시오");
                continue;
            }
        }
    }
    
}
