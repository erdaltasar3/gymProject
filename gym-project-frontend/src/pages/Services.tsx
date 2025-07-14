import React from 'react';
import './Services.css';

const Services: React.FC = () => {
  const services = [
    {
      icon: '🏋️‍♂️',
      title: 'Kişisel Antrenman',
      description: 'Birebir antrenör desteği ile özel program ve hedef odaklı çalışma',
      features: ['Kişisel program hazırlama', 'Birebir antrenör desteği', 'İlerleme takibi', 'Beslenme önerileri'],
      price: '150₺/seans'
    },
    {
      icon: '👥',
      title: 'Grup Dersleri',
      description: 'Motivasyonu artıran grup dinamiği ile eğlenceli antrenmanlar',
      features: ['Yoga & Pilates', 'Zumba & Dans', 'CrossFit', 'Spinning'],
      price: '50₺/ders'
    },
    {
      icon: '🥗',
      title: 'Beslenme Danışmanlığı',
      description: 'Uzman diyetisyen eşliğinde kişisel beslenme programları',
      features: ['Vücut analizi', 'Kişisel diyet programı', 'Aylık kontroller', 'Besin takviyesi önerileri'],
      price: '200₺/ay'
    },
    {
      icon: '🧘‍♀️',
      title: 'Wellness & SPA',
      description: 'Antrenman sonrası dinlenme ve rahatlama hizmetleri',
      features: ['Sauna & Buhar odası', 'Masaj hizmetleri', 'Aromaterapi', 'Meditasyon alanı'],
      price: '100₺/seans'
    },
    {
      icon: '⚕️',
      title: 'Fizik Tedavi',
      description: 'Sakatlık önleme ve rehabilitasyon hizmetleri',
      features: ['Sakatlık değerlendirmesi', 'Rehabilitasyon programı', 'Önleme egzersizleri', 'Uzman fizyoterapist desteği'],
      price: '180₺/seans'
    },
    {
      icon: '📊',
      title: 'Vücut Analizi',
      description: 'Modern teknoloji ile detaylı vücut kompozisyon analizi',
      features: ['Body scan analizi', 'Kas-yağ oranı', 'Metabolizma hızı', 'İlerleme raporları'],
      price: '75₺/analiz'
    }
  ];

  return (
    <div className="services">
      <div className="services-hero">
        <div className="container">
          <h1>Hizmetlerimiz</h1>
          <p>Size en uygun hizmeti bulun ve hedeflerinize ulaşın!</p>
        </div>
      </div>

      <div className="services-content">
        <div className="container">
          <div className="services-grid">
            {services.map((service, index) => (
              <div key={index} className="service-card">
                <div className="service-header">
                  <div className="service-icon">{service.icon}</div>
                  <h3>{service.title}</h3>
                  <p>{service.description}</p>
                </div>

                <div className="service-features">
                  <ul>
                    {service.features.map((feature, featureIndex) => (
                      <li key={featureIndex}>{feature}</li>
                    ))}
                  </ul>
                </div>

                <div className="service-footer">
                  <div className="service-price">{service.price}</div>
                  <button className="btn btn-primary">Bilgi Al</button>
                </div>
              </div>
            ))}
          </div>
        </div>
      </div>

      {/* Facilities Section */}
      <div className="facilities">
        <div className="container">
          <h2>Tesis Özelliklerimiz</h2>
          <div className="facilities-grid">
            <div className="facility-item">
              <div className="facility-icon">🏃‍♀️</div>
              <h3>Kardio Alanı</h3>
              <p>Son model koşu bantları, eliptik ve bisikletler</p>
            </div>
            <div className="facility-item">
              <div className="facility-icon">🏋️</div>
              <h3>Ağırlık Antrenman</h3>
              <p>Profesyonel ağırlık ekipmanları ve serbest ağırlıklar</p>
            </div>
            <div className="facility-item">
              <div className="facility-icon">🧘</div>
              <h3>Grup Ders Salonları</h3>
              <p>Geniş ve aydınlık grup dersi alanları</p>
            </div>
            <div className="facility-item">
              <div className="facility-icon">🚿</div>
              <h3>Soyunma Odaları</h3>
              <p>Temiz ve konforlu soyunma odaları</p>
            </div>
            <div className="facility-item">
              <div className="facility-icon">🅿️</div>
              <h3>Ücretsiz Park</h3>
              <p>Geniş ve güvenli otopark alanı</p>
            </div>
            <div className="facility-item">
              <div className="facility-icon">☕</div>
              <h3>Kafeterya</h3>
              <p>Sağlıklı atıştırmalık ve içecekler</p>
            </div>
          </div>
        </div>
      </div>

      {/* Package Comparison */}
      <div className="packages">
        <div className="container">
          <h2>Paket Karşılaştırması</h2>
          <div className="packages-grid">
            <div className="package-card basic">
              <h3>Temel Paket</h3>
              <div className="package-price">199₺<span>/ay</span></div>
              <ul>
                <li>✅ Tüm salon erişimi</li>
                <li>✅ Grup dersleri</li>
                <li>✅ Soyunma odaları</li>
                <li>❌ Kişisel antrenman</li>
                <li>❌ Beslenme danışmanlığı</li>
              </ul>
              <button className="btn btn-secondary">Seç</button>
            </div>

            <div className="package-card premium">
              <div className="popular-badge">En Popüler</div>
              <h3>Premium Paket</h3>
              <div className="package-price">399₺<span>/ay</span></div>
              <ul>
                <li>✅ Tüm salon erişimi</li>
                <li>✅ Tüm grup dersleri</li>
                <li>✅ Aylık 4 kişisel antrenman</li>
                <li>✅ Beslenme danışmanlığı</li>
                <li>✅ Vücut analizi</li>
              </ul>
              <button className="btn btn-primary">Seç</button>
            </div>

            <div className="package-card vip">
              <h3>VIP Paket</h3>
              <div className="package-price">599₺<span>/ay</span></div>
              <ul>
                <li>✅ Tüm hizmetler dahil</li>
                <li>✅ Sınırsız kişisel antrenman</li>
                <li>✅ Beslenme danışmanlığı</li>
                <li>✅ SPA & Wellness</li>
                <li>✅ Öncelikli rezervasyon</li>
              </ul>
              <button className="btn btn-primary">Seç</button>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Services;
