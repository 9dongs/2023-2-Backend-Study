##  WIL2 
@ http 란
Transfer layer
TCP/IP 기반으로 서버와 클라이언트 간의 요청과 응답을 전송한다. 
TCP, UDP란?
• 비 연결성 (connectionless)
클라이언트와 서버가 한번 연결을 맺은 후에 클라이언트의 요청에 대해 서버가 응답을 마치면 연결을 끊어버린다.

• 무상태성 (stateless)
Connectionless로 인해 서버가 두 요청간의 어떠한 데이터도 유지하지 않는다. 즉, 서버는 클라이언트와 연결에 대한 정보를 저장하지않는다.
그래서 서버는 클라이언트를 식별하지 못한다.

@ https 란
하이퍼텍스트 전송 프로토콜 보안(HTTPS)은 웹 브라우저와 웹 사이트 간에 데이터를 전송하는 데 사용되는 기본 프로토콜인 HTTP의 보안 버전입니다. 
HTTPS는 데이터 전송의 보안을 강화하기 위해 암호화됩니다.


@ http 와 https 비교
엄밀히 말하면 HTTPS는 HTTP와 별개의 프로토콜이 아닙니다. 
HTTPS는 단순히 HTTP 프로토콜을 통해 TLS/SSL 암호화를 사용하는 것입니다. 
HTTPS는 특정 공급자가 주장하는 실체가 맞는지 확인하는 TLS/SSL 인증서의 전송을 기반으로 이루어집니다.


@ 아래 API에 대한 RESTful한 URI를 설계하라.

• 이벤트 목록 조회 : GET /events
• 이벤트 조회 : GET /events/{id}
• 이벤트 등록 : POST /events
• 이벤트 수정 : PUT /events/{id}
• 이벤트 삭제 : DELETE /events/{id}
• 이벤트 상태 변경 : PATCH /events/{id}/conditions
• 특정 이벤트의 주문 목록 조회 : GET /events/{id}/orders
• 멤버 목록 조회 : GET /users
• 특정 멤버 권한 변경 : PATCH /users/{id}/authority
• 특정 멤버 정보 조회 : GET /users/{id}
• 특정 멤버 정보 변경 : PATCH /users/{id}
• 멤버 등록 : POST /users
