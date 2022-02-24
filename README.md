# MiniProject2022_02
Project_Name : MOHAE


지금 뭐해? 는 활동 공유 플랫폼입니다.

자신의 지금 이 순간을 함께하거나 공유하고 싶어하는 다른 유저와 자유롭게 소통할수 있게 하는 공유 및 소통을

목적으로 두고 있습니다.

지금 이 순간을 업로드하는 것은 다른 커뮤니티에서도 볼 수 있지만,

해당 지금 이 순간을 실시간 댓글 및 커뮤니티 채팅방 개설, 영상공유, 카테고리 등을 통해

자유롭게 커스트마이징 및 서비스를 이용할 수 있게하는 차별성을 두고 있습니다.

프로젝트 구성 및 기능
프로젝트 개요
→ 테마 : 활동 공유 플랫폼

→ 목표 : 사이트 서버 및 기본 베이스 골자를 완성하여, 추후 진행될 프로젝트의 그릇을 설계 및 구현

→ 게시판 형식 / 댓글 작성 / 관심 버튼 등등.....

메인페이지 : COMPONENT 헤더, 배너, SWIPER, NOMAL_LIST
a) 헤더 : 현재 모든 페이지 FIXED로 고정. 메인과 서브 property값으로 구분하여 css 적용 로그인/비로그인시 버튼 노출여부 완성 반응형 구성 완료 _ 베이스 1280px, 860px, 500px,

b) 배너 : 메인페이지의 경우 swiper ~ video로 구성. 서브페이지의 경우 이미지로 구성

c) swiper : 마이페이지와 동일한 형태로 메인페이지 best_list부분 back에서 받아온 데이터로 card형태로 노출

d) NOMAL_LIST : nomal_list 부분 back에서 받아온 데이터로 list 형태로 노출



회원가입 페이지
a) 회원가입 정책 : 아이디(이메일) / 닉네임 (자유) / 비밀번호로 구성 아이디와 닉네임은 중복확인 필수 적용. 대략적인 유효성 검사 적용(중복확인, 비밀번호일치성)



로그인 페이지
아이디(이메일)와 비밀번호로 로그인. 로그인 완료시, response : headers를 통해 토큰을 발급 및 쿠키, 세션에 저장


![001](https://user-images.githubusercontent.com/97423687/154423580-826c95e5-a592-443f-876a-53d2142545be.png)



![image](https://user-images.githubusercontent.com/74662752/154426499-a6163783-e185-4b2c-9ed3-26ef777ca4f9.png)

![image](https://user-images.githubusercontent.com/74662752/154471389-04709bca-d906-4f73-a2d4-962fcd14071e.png)
![image](https://user-images.githubusercontent.com/74662752/154471453-6378a93c-167a-4fe6-bcdb-c9eceba31450.png)
![image](https://user-images.githubusercontent.com/74662752/154470788-135313a9-018a-4a20-87aa-22aa8b30dc87.png)
![image](https://user-images.githubusercontent.com/74662752/154471087-d0cd35ef-fa97-4d2e-bc76-4da806f2a6d8.png)
![image](https://user-images.githubusercontent.com/74662752/154471132-ce23fdc6-459c-48ab-82d0-aac5fcaf9e01.png)
![image](https://user-images.githubusercontent.com/74662752/154471174-490cc0f7-6706-4092-9538-d86166fffdb7.png)


