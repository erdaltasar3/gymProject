import React from 'react';
import './Trainers.css';

const Trainers: React.FC = () => {
  const trainers = [
    {
      name: 'Ahmet Kaya',
      specialty: 'Kişisel Antrenman & Beslenme',
      experience: '8 yıl',
      image: '👨‍💼',
      bio: 'Spor bilimleri mezunu, beslenme uzmanı. Kilo verme ve kas kazanımında uzman.',
      certifications: ['ACE Sertifikalı', 'Beslenme Uzmanı', 'Crossfit L1']
    },
    {
      name: 'Elif Demir',
      specialty: 'Yoga & Pilates',
      experience: '6 yıl',
      image: '👩‍💼',
      bio: 'Yoga ve pilates eğitmeni. Esneklik ve zihinsel sağlık konularında uzman.',
      certifications: ['200h Yoga Alliance', 'Pilates Sertifikası', 'Meditasyon Eğitmeni']
    },
    {
      name: 'Mehmet Özkan',
      specialty: 'Crossfit & Fonksiyonel Antrenman',
      experience: '10 yıl',
      image: '👨‍🏫',
      bio: 'Eski atletizm sporcusu. Fonksiyonel antrenman ve dayanıklılık sporlarında uzman.',
      certifications: ['Crossfit L2', 'TRX Eğitmeni', 'Atletizm Antrenörü']
    },
    {
      name: 'Seda Yılmaz',
      specialty: 'Dans & Zumba',
      experience: '5 yıl',
      image: '👩‍🎨',
      bio: 'Profesyonel dansçı ve grup dersi uzmanı. Eğlenceli ve motivasyonel dersler.',
      certifications: ['Zumba Sertifikası', 'Dans Eğitmeni', 'Grup Fitness']
    }
  ];

  return (
    <div className="trainers">
      <div className="trainers-hero">
        <div className="container">
          <h1>Uzman Antrenör Kadromuz</h1>
          <p>Deneyimli ve sertifikalı antrenörlerimizle hedeflerinize ulaşın!</p>
        </div>
      </div>

      <div className="trainers-content">
        <div className="container">
          <div className="trainers-grid">
            {trainers.map((trainer, index) => (
              <div key={index} className="trainer-card">
                <div className="trainer-image">
                  <span className="trainer-avatar">{trainer.image}</span>
                </div>
                
                <div className="trainer-info">
                  <h3>{trainer.name}</h3>
                  <p className="trainer-specialty">{trainer.specialty}</p>
                  <p className="trainer-experience">📅 {trainer.experience} deneyim</p>
                  
                  <div className="trainer-bio">
                    <p>{trainer.bio}</p>
                  </div>
                  
                  <div className="trainer-certifications">
                    <h4>Sertifikalar:</h4>
                    <ul>
                      {trainer.certifications.map((cert, certIndex) => (
                        <li key={certIndex}>{cert}</li>
                      ))}
                    </ul>
                  </div>
                  
                  <button className="btn btn-primary">Randevu Al</button>
                </div>
              </div>
            ))}
          </div>
        </div>
      </div>

      <div className="trainer-booking">
        <div className="container">
          <h2>Antrenör Seçimi</h2>
          <p>Size en uygun antrenörü seçin ve hedeflerinize ulaşmak için özel program oluşturun.</p>
          
          <div className="booking-features">
            <div className="booking-feature">
              <div className="feature-icon">📅</div>
              <h3>Esnek Randevu</h3>
              <p>Size uygun saatlerde randevu alabilirsiniz</p>
            </div>
            <div className="booking-feature">
              <div className="feature-icon">💡</div>
              <h3>Kişisel Program</h3>
              <p>Hedeflerinize özel antrenman programı</p>
            </div>
            <div className="booking-feature">
              <div className="feature-icon">📊</div>
              <h3>İlerleme Takibi</h3>
              <p>Düzenli ölçüm ve değerlendirmeler</p>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Trainers;
