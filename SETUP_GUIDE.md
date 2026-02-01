# Android Studio 설치 및 환경 설정 가이드

이 문서는 macOS에서 프로젝트를 클론받고, Android Studio를 설치하여 앱을 실행하는 방법을 안내합니다.

---

## 1단계: 프로젝트 클론받기

터미널을 열고 원하는 디렉토리에서 다음 명령어를 실행합니다:

```bash
git clone https://github.com/minnczi/music-sale-platform-android.git
```

클론이 완료되면 프로젝트 폴더로 이동:

```bash
cd music-sale-platform-android
```

---

## 2단계: Android Studio 다운로드

1. https://developer.android.com/studio 접속
2. **"Download Android Studio"** 버튼 클릭
3. 약관에 동의하고 `.dmg` 파일 다운로드

---

## 3단계: Android Studio 설치

1. 다운로드한 `.dmg` 파일 열기
2. **Android Studio**를 **Applications** 폴더로 드래그
3. Applications에서 Android Studio 실행
4. macOS에서 확인 요청 시 **"열기"** 클릭

---

## 4단계: 초기 설정 마법사

Android Studio 첫 실행 시:

1. **"Do not import settings"** 선택 (설정 가져오기 묻는 경우)
2. 환영 화면에서 **Next** 클릭
3. 설치 유형: **"Standard"** 선택 → **Next** 클릭
4. UI 테마 선택 (Light/Dark) → **Next** 클릭
5. 다운로드할 구성요소 확인:
   - Android SDK
   - Android SDK Platform
   - Android Virtual Device (에뮬레이터)
6. **Next** → **Finish** 클릭
7. 다운로드 완료까지 대기 (약 10-15분 소요)

---

## 5단계: 프로젝트 열기

1. 환영 화면에서 **"Open"** 클릭
2. 1단계에서 클론받은 `music-sale-platform-android` 폴더 선택
3. **Open** 클릭
4. "Trust this project?" 메시지가 나오면 **Trust Project** 클릭
5. Gradle 동기화 완료까지 대기 (하단 진행 표시줄 확인)
   - 첫 동기화 시 의존성 다운로드로 몇 분 소요될 수 있음

---

## 6단계: 에뮬레이터 설정

1. 메뉴에서 **Tools → Device Manager** 선택 (또는 툴바의 폰 아이콘 클릭)
2. **"Create Device"** 클릭
3. 휴대폰 선택 (예: **Pixel 6**) → **Next** 클릭
4. 시스템 이미지 선택:
   - **API 34** (또는 최신 버전) 선택
   - 필요시 옆의 **Download** 클릭하여 다운로드
   - 다운로드 완료 후 **Finish** 클릭
5. **Next** → **Finish** 클릭

---

## 7단계: 앱 실행

1. 툴바의 기기 드롭다운에서 생성한 에뮬레이터 선택
2. **초록색 재생 버튼 ▶️** 클릭 (또는 `Ctrl + R`)
3. 에뮬레이터 부팅 대기 (첫 실행 시 시간이 더 걸림)
4. 앱이 자동으로 설치되고 실행됨

---

## 문제 해결

| 문제 | 해결 방법 |
|------|----------|
| Gradle 동기화 실패 | File → Sync Project with Gradle Files |
| SDK를 찾을 수 없음 | File → Project Structure → SDK Location에서 경로 설정 |
| 에뮬레이터가 느림 | BIOS/설정에서 하드웨어 가속 활성화 |
| "INSTALL_FAILED" 오류 | Device Manager에서 에뮬레이터 데이터 초기화 (Wipe Data) |

---

## 권장 설정

설정 완료 후 **Android Studio → Settings** (또는 `Cmd + ,`)에서:

1. **Editor → General → Auto Import**
   - "Add unambiguous imports on the fly" 활성화

2. **Editor → Code Style → Kotlin**
   - "Kotlin style guide"로 설정

---

## 유용한 단축키

| 단축키 | 기능 |
|--------|------|
| `Cmd + R` | 앱 실행 |
| `Cmd + Shift + R` | 앱 디버그 모드 실행 |
| `Cmd + O` | 클래스 검색 |
| `Cmd + Shift + O` | 파일 검색 |
| `Cmd + B` | 정의로 이동 |
| `Cmd + ,` | 설정 열기 |
| `Cmd + E` | 최근 파일 목록 |

---

## 실제 기기에서 테스트하기 (선택사항)

에뮬레이터 대신 실제 Android 기기를 사용하려면:

1. Android 기기에서 **설정 → 휴대전화 정보 → 빌드 번호**를 7번 탭하여 개발자 옵션 활성화
2. **설정 → 개발자 옵션 → USB 디버깅** 활성화
3. USB 케이블로 Mac에 연결
4. "USB 디버깅을 허용하시겠습니까?" 메시지가 나오면 **허용** 선택
5. Android Studio의 기기 드롭다운에서 연결된 기기 선택
6. 재생 버튼 클릭하여 앱 실행
