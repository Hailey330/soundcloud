function like(userId, boardId) {
	var data = {
			userId : userId,
			boardId : boardId
		};

		$.ajax({
			type : "post",
			url : "/soundcloud/board?cmd=like",
			data : JSON.stringify(data),
			contentType : "application/json; charset=UTF-8",
			dataType : "json"
		}).done(function(result) {
			if (result == -1 || result == 0) {
				console.log("좋아요 실패");
			} else {
				console.log("좋아요 성공");
				
				
			}
		}).fail(function(error) {
			alert("좋아요 에러");
		});
	}