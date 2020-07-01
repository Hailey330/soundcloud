package com.sc.soundcloud.dto;

import java.util.List;

import com.sc.soundcloud.model.Board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DetailResponseDto {
	private Board board;
	private List<ReplyResponseDto> replyDtos;
}
