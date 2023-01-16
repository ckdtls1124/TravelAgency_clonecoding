package org.spring.TravelAgencyClone.dto;

import lombok.*;
import org.spring.TravelAgencyClone.entity.DupCheckEntity;

import javax.persistence.Column;
import javax.persistence.Id;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DupCheckDTO {

    private String mobileNumber;
    private String name;
    private String birth;
    private String AuthNum;


    static class DupCheckDTOReq{
//        DTO -> Entity

        public static DupCheckEntity toEntity(DupCheckDTO req){
            DupCheckEntity entity=new DupCheckEntity();
            entity.setMobileNumber(req.getMobileNumber());
            entity.setName(req.getName());
            entity.setBirth(req.getBirth());
            entity.setAuthNum(req.getAuthNum());
            return entity;
        }
    }

    static class DupCheckDTOResp{
//        Entity -> DTO
        public static DupCheckDTO toDTO(DupCheckEntity entity){
            DupCheckDTO dto=new DupCheckDTO();
            dto.setMobileNumber(entity.getMobileNumber());
            dto.setName(entity.getName());
            dto.setBirth(entity.getBirth());
            dto.setAuthNum(entity.getAuthNum());
            return dto;
        }
    }


}
