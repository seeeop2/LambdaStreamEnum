package enum4;

public class Sample05 {
    public static void main(String[] args){
        CITY returnCity = CITY.valueof(4);
        System.out.println(returnCity.getDestination());

    }
}


enum CITY{
    SEOUL("서울"),DAEJEON("대전"),DAEGU("대구"),PUSAN("부산"),GWANGJU("광주");
    //SEOUL("서울",0),DAEJEON("대전",1),DAEGU("대구",2),PUSAN("부산",3),GWANGJU("광주",4);    //위 처럼 enum을 사용할 경우, 중간에 JEJU("제주") 이렇게 들어올 시,
                                                                                        //순서가 바뀌고, 이미 저장되어있는 자료가 있다면 데이터가 맞지 않는 문제 발생.
                                                                                        //그래서 파라미터 값을 하나 더 줘서 관리를 하는 것이 좋다.
    private final String destination;

    CITY(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public static CITY valueof(int selectNum){  //메소드 작성
        CITY retrunCity = null; //

        for(CITY city : CITY.values()){
            if(city.ordinal() == selectNum){
                retrunCity = city;
                break;
            }
        }
        return retrunCity;
    }
}