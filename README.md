
  <img src="https://render.gitanimals.org/lines/gyseon?pet-id=654188443304852967" width="1000" height="120"/>


# Cine-Mate  
**챗봇 기반 영화 추천 시스템**   
Spring Boot, Docker, AWS를 활용해 개발한 챗봇 기반 영화 추천 시스템. TMDB, OpenAI API를 연동하여 개인화된 영화 추천과 인터랙티브 기능 제공

## 개요  
Cine-Mate는 사용자 취향에 맞는 영화를 추천해주는 Java 기반 애플리케이션입니다.  
챗봇 인터페이스를 통해 사용자는 영화 추천, 검색, 세부 정보 조회 등의 기능을 간편하게 이용할 수 있습니다.

---

## 주요 기능  
### 영화 추천  
- 장르, 배우, 출시 연도 등 사용자의 선호도를 기반으로 영화 추천.  
- TMDB, OMDB와 같은 외부 API를 활용하여 실시간 영화 데이터 제공.  

### 챗봇 인터페이스  
- 자연어를 사용한 간단한 요청 (예: "스릴러 영화 추천해줘").  
- 영화 세부 정보 조회 가능 (예: "이 영화 줄거리 알려줘").  

### 즐겨찾기 및 리뷰  
- 추천받은 영화를 즐겨찾기에 추가.  
- 간단한 리뷰 작성 기능 제공.  

### 영화 검색 및 필터링  
- 특정 영화 검색.  
- 출시 연도, 장르, IMDb 평점 기준으로 필터링.  

### 다국어 지원  
- 한국어와 영어 지원으로 사용자 편의성 강화.  

---

## 기술 스택  
### 백엔드  
- **Java, Spring Boot**  
- 영화 데이터와 사용자 상호작용을 처리하는 REST API.  

### 챗봇  
- **OpenAI API (ChatGPT)** 또는 **Dialogflow**를 사용해 대화형 기능 구현.  

### 데이터베이스  
- **PostgreSQL/MySQL**  
- 사용자 선호도, 검색 기록, 추천 로그 저장.  

### 배포  
- **Docker**를 사용한 컨테이너화.  
- **AWS ECS/Fargate** 를 통해 클라우드 배포.  

---

## 설치 및 설정  
1. **레포지토리 클론**  
   ```bash
   git clone https://github.com/gyseon/cine-mate.git
   cd cine-mate
2. **API 키 설정**   
   ```bash
   TMDB API 키
   OpenAI API 키
3. **애플리케이션 빌드 및 실행**   
   ```bash
   ./mvnw spring-boot:run
4. **Docker 설정**  
   ```bash
   docker build -t cine-mate .
   docker-compose up

---

## 동작 방식
1. 사용자가 챗봇에 요청 입력 (예: "코미디 영화 추천해줘").
2. 챗봇이 요청을 자연어로 처리하여 의도를 분석.
3. 백엔드에서 TMDB API를 호출해 추천 결과 반환.
4. 챗봇이 사용자에게 결과를 전달.

---

## 향후 개선 사항
* **추천 알고리즘 개선**: 협업 필터링 및 개인화 알고리즘 추가.
* **UI/UX 개발**: 사용자 경험 강화를 위한 React 기반 웹 인터페이스 개발.
* **다국어 지원 확대**: 영어와 한국어 외에 더 많은 언어 지원.

---

## 패키지 구조
\src\test\java\com\boot\cinemate
├── controller       // API 엔드포인트를 정의
├── service          // 비즈니스 로직 처리
├── repository       // DB와의 상호작용
├── entity           // JPA 엔티티 클래스
├── dto              // 요청/응답을 위한 DTO 클래스
├── config           // 설정 파일
