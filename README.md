DB연결

#DB연결
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
spring.datasource.url=jdbc:mariadb://localhost:3306/bootex
spring.datasource.username=bootuser
spring.datasource.password=1234


spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.show-sql=true
////////////////////////

Entity
어노테이션

@Entity
//table 네임d
@Table(name = "tbl_memo")
//
@Getter
@Setter


//
//builer는 객체생성가능하게
@Builder
//아래 두개는 @Builder를 사용할때 무조건 사용해야한다
@AllArgsConstructor
@NoArgsConstructor
//
///////
Test

public void testSelect(){
        Long mno = 100L;

        Optional<Memo> result = memoRepository.findById(mno);
        System.out.println("===========");

        if (result.isPresent()){
//            - Boolean 타입
//- Optional 객체가 값을 가지고 있다면 true, 값이 없다면 false 리턴
        Memo memo = result.get();
            System.out.println(memo);
        }
    }
