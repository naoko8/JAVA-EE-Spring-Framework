package com.example.ninopotskhishvili.dto;

import lombok.Data;

import java.util.List;

@Data
public class GetMoviesOutput {
    private List<MovieDTO> movieDTOList;
}
