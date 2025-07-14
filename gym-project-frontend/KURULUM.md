# FitZone Frontend - Kurulum Rehberi

## Gereksinimler
- Node.js (v16 veya üzeri)
- npm (Node.js ile birlikte gelir)

## Kurulum Adımları

### 1. Node.js Kurulumu
1. https://nodejs.org/ adresine gidin
2. LTS (Long Term Support) versiyonunu indirin
3. İndirdiğiniz dosyayı çalıştırın ve kurulumu tamamlayın
4. Terminal'i yeniden başlatın

### 2. Kurulumu Doğrulama
Terminal/PowerShell'de aşağıdaki komutları çalıştırın:
```bash
node --version
npm --version
```

### 3. Proje Bağımlılıklarını Yükleme
Proje klasöründe:
```bash
cd "c:\Users\Barış\Desktop\Gym_Project\gymProject\gym-project-frontend"
npm install
```

### 4. Projeyi Çalıştırma
```bash
npm start
```

Tarayıcınızda otomatik olarak http://localhost:3000 açılacaktır.

## Yaygın Hatalar ve Çözümleri

### "npm is not recognized" hatası
- Node.js kurulu değil veya PATH'e eklenmemiş
- Node.js'i yeniden kurun
- Terminal'i yeniden başlatın

### React tanınmıyor hatası
- npm install komutunu çalıştırmamışsınız
- Önce npm install yapın

### Port 3000 kullanımda hatası
- Başka bir uygulama 3000 portunu kullanıyor
- Diğer uygulamayı kapatın veya farklı port kullanın

## Proje Yapısı
```
gym-project-frontend/
├── public/
├── src/
│   ├── components/    # Header, Footer gibi ortak bileşenler
│   ├── pages/         # Ana sayfa, İletişim gibi sayfalar
│   ├── styles/        # CSS dosyaları
│   └── App.tsx        # Ana uygulama dosyası
├── package.json       # Proje bağımlılıkları
└── README.md
```

## Geliştirme
- Kod değişiklikleri otomatik olarak tarayıcıda güncellenir
- Hata mesajları tarayıcı ve terminal'de görüntülenir
