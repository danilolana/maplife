package com.maplife.backend.mapper;

public package com.maplife.backend.mapper;



public class HabitoMapper {

    private  HabitoMapper(){}

    public static HabitoDTO toDTO( Habito habito){
    return new  HabitoDTO(
        habito.getId(),
        habito.getName(),
        habito.getDescripition(),
        habito.getSequenceofday(),
        habito.getDaytarget()
        
    );


}

    public static  Habito toEntity( HabitoDTO habitoDTO) {
    return new  Habito(
        habitoDTO.getName(),
        habitoDTO.getDescription(),
        habitoDTO.getSequenceofday(),
        habitoDTO.getDaytarget()

      );
   }

} 
    

