package org.zerock.ex2.entity;

import jakarta.persistence.*;
import lombok.*;

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

public class Memo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mno;

    @Column(length = 200, nullable = false)
    private String memoText;


}
