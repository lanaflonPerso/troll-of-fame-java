import static elf.Race.DARK;
import static elf.Race.HIGH;
import static elf.Role.ARCHER;
import static elf.Role.SWORDSMAN;
import static elf.Role.WARLOCK;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ElfTest {

  @Test
  void darkWarlock() {
    Elf doomShadow = new Elf(HIGH, WARLOCK);

    assertThat(doomShadow.value()).isEqualTo(8);
  }

  @Test
  void darkArcherSameValueAsHighSwordsman() {
    Elf faeor = new Elf(HIGH, SWORDSMAN);
    Elf shadowBlight = new Elf(DARK, ARCHER);

    assertThat(faeor.value()).isEqualTo(shadowBlight.value());
  }

}
