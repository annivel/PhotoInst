package accountInfo;

import java.util.Objects;

public class ProfileInfo {

   public String profile;

    public ProfileInfo(String profile) {
        this.profile = profile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProfileInfo)) return false;
        ProfileInfo that = (ProfileInfo) o;
        return Objects.equals(profile, that.profile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(profile);
    }

    @Override
    public String toString() {
        return "ProfileInfo{" +
                "profile='" + profile + '\'' +
                '}';
    }
}
