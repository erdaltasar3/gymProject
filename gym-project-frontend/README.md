# FitZone - Spor Salonu Frontend

Modern ve responsive spor salonu web sitesi.

## Özellikler

- 🎨 Modern ve kullanıcı dostu tasarım
- 📱 Responsive (mobil uyumlu) arayüz
- ⚡ Hızlı ve optimize edilmiş performans
- 🧭 Kolay navigasyon
- 📞 İletişim formu
- 💪 Hizmetler ve paket karşılaştırması

## Sayfa Yapısı

- **Ana Sayfa** - Hero section, özellikler, hizmetler önizlemesi
- **Hizmetler** - Detaylı hizmet listesi ve paket karşılaştırması
- **İletişim** - İletişim formu ve bilgileri
- **Header** - Navigation menüsü (responsive)
- **Footer** - İletişim bilgileri ve linkler

## Teknolojiler

- React 18
- TypeScript
- React Router DOM
- CSS3 (Flexbox, Grid, Animations)
- Responsive Design

## Kurulum

1. Node.js ve npm'i yükleyin
2. Proje klasöründe aşağıdaki komutları çalıştırın:

```bash
npm install
npm start
```

3. Tarayıcınızda `http://localhost:3000` adresini açın

## Geliştirme

### Yeni Sayfa Ekleme

1. `src/pages/` klasörüne yeni component ekleyin
2. CSS dosyasını oluşturun
3. `App.tsx` dosyasında route tanımını ekleyin
4. Header navigation'a link ekleyin

### Stil Değişiklikleri

- Genel stiller: `src/styles/index.css`
- Component stilleri: Her component'in kendi CSS dosyası
- Renkler ve tema: CSS custom properties kullanın

## Klasör Yapısı

```
src/
├── components/          # Tekrar kullanılabilir componentler
│   ├── Header.tsx
│   ├── Header.css
│   ├── Footer.tsx
│   └── Footer.css
├── pages/              # Sayfa componentleri
│   ├── Home.tsx
│   ├── Home.css
│   ├── Services.tsx
│   ├── Services.css
│   ├── Contact.tsx
│   └── Contact.css
├── styles/             # Genel stiller
│   ├── index.css
│   └── App.css
├── services/           # API servisleri (gelecekte)
├── App.tsx
└── index.tsx
```

## Backend Entegrasyonu

Backend API ile entegrasyon için `src/services/` klasöründe API servislerini oluşturun.

Örnek API servisi:
```typescript
// src/services/api.ts
const API_BASE_URL = 'http://localhost:8080/api';

export const apiService = {
  // Üyelik işlemleri
  getMemberships: () => fetch(`${API_BASE_URL}/memberships`),
  
  // İletişim formu
  sendContact: (data: ContactForm) => 
    fetch(`${API_BASE_URL}/contact`, {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify(data)
    })
};
```

## Deployment

Production build için:

```bash
npm run build
```

Build dosyaları `build/` klasöründe oluşturulur.

## İletişim

Proje ile ilgili sorularınız için iletişime geçin.
